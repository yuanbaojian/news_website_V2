package com.ybj.news_website.controller;

import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.ArticleService;
import com.ybj.news_website.serviceInterface.NewsClassificationService;
import com.ybj.news_website.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    NewsClassificationService newsClassificationService;

    @Autowired
    ArticleService articleService;

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping("/tologin")
    public String tologin()
    {
        return "common/login";
    }


    @RequestMapping("/toRegister")
    public String toRegister(HttpSession session)
    {
        session.removeAttribute("msg");
        return "common/register";
    }


    @RequestMapping("/indexLoged")
    public  String indexLoged(Model model)
    {
        List<Map<String,String>> classification= newsClassificationService.GetFive();
        model.addAttribute("classification", classification);

        List<Map<String,String>> articles= articleService.GetAllByTime();
        model.addAttribute("articles", articles);
        return "home/index_loged";
    }


    //注册
    @RequestMapping("/register")
    public String register(String user_account, String  user_password, String user_email, HttpSession session)
    {

        User user=new User();
        user.setUser_account(user_account);
        user.setUser_password(user_password);
        user.setUser_email(user_email);
        user.setRole_id(1);
        userService.InsertUser(user);

        Integer user_id=user.getUser_id();

        session.setAttribute("user_id", user_id);
        session.setAttribute("user_account", user_account);

        //发送邮件， 给用户账号
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1793870688@qq.com");
        message.setTo(user_email);
        message.setSubject("《保健新闻》注册提醒");
        message.setText("欢迎注册保健新闻， 注册的用户id为 : " + user_id);

        mailSender.send(message);

        return "redirect:/";
    }


    /**
     * 登陆还是得靠ID  ，不能用account
     * @param user_id
     * @param user_password
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(Integer  user_id, String user_password,HttpSession session){

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user_id", user_id);




        User user=userService.login(user_id, user_password);

       // System.out.println(" role_id 为 " + list.get(0).get("role_id"));
        if (!StringUtils.isEmpty(user))
        {
            session.setAttribute("user_account", user.getUser_account());
            session.setAttribute("user_id", user.getUser_id());
            Integer  role_id= user.getRole_id();

            //跳转到用户管理页面
            if(role_id==1) {

                int userArticleNum=articleService.getUserArticleNum(user.getUser_id());
                modelAndView.addObject("articleNum", userArticleNum);
                modelAndView.setViewName("user/dashBoard");
            }
            //跳转到管理员页面
            else {
                int userNum=userService.getUserNum();
                modelAndView.addObject("userNum", userNum);

                int articleNum=articleService.getArticleNum();
                modelAndView.addObject("articleNum", articleNum);

                modelAndView.setViewName("admin/dashBoard");
            }
        }
        //账号或密码错误
        else {
            session.setAttribute("msg", "账号或密码错误");
            modelAndView.setViewName("common/login");
        }
        return modelAndView;
    }

    //退出系统
    @RequestMapping("/logout")
    public String logout(HttpSession session)
    {
        session.removeAttribute("user_id");
        return "redirect:/";
    }

    //返回普通用户后台
    @RequestMapping("/userHome")
    public String userHome()
    {
        return "user/dashBoard";
    }

    //获取自己用户信息
    @GetMapping("/userInfo")
    public String getUserInfo(Model model,HttpSession session)
    {
        Integer  user_id= (Integer ) session.getAttribute("user_id");
        User user=userService.GetUserById(user_id);
        model.addAttribute("user", user);

        return "user/userInfo";
    }


//    跳转到修改个人信息页面
    @RequestMapping("/toEditUserInfo")
    public String toEditUserInfo( Integer  user_id, Model model)
    {
    //应该用单个获取， list<map>不适合了， 取名也不对
        User user=userService.GetUserById(user_id);
        model.addAttribute("user",user);
        return "user/editUserInfo";
    }


    //修改个人信息
    @PutMapping("/user")
    public String Edit(User user)
    {
        userService.Update(user);
        return "redirect:/userInfo";
    }

    //去修改密码
    @RequestMapping("/toChangePwd")
    public String toChangePwd(Model model, HttpSession session)
    {
        return "user/editPwd";
    }

    //去修改密码
    @RequestMapping("/changePwd")
    public String ChangePwd(String oldPwd, String newPwd, String reNewPwd, HttpSession session)
    {
        //判断oldPwd是否正确
        String returnPath;
        String pwd_msg="";
        Integer user_id= (Integer) session.getAttribute("user_id");
        boolean f=userService.checkPwd(oldPwd,user_id);
        //old正确
        if(f)
        {
            //判断两次密码是否一致
            if(newPwd.equals(reNewPwd))
            {
                //更改密码
                userService.changePwd(newPwd,user_id);
                returnPath="redirect:/userInfo";
            }
            //两次密码不一致
            else
            {
                pwd_msg="两次密码不一致";
                returnPath="redirect:/toChangePwd";
            }

        }
        //旧密码错误
        else {
            pwd_msg="旧密码错误";
            returnPath="redirect:/toChangePwd";
        }

        session.setAttribute("pwd_msg", pwd_msg);

        return returnPath;
    }



    /**
     * 这个东西，  得使用@restController， 但是上面的跳转，需要Controller
     * 估计数据获取之类的，需要使用Responsebody
     * @return
     */
    @RequestMapping("/Mybatis/test")
    @ResponseBody
    public Object User(){
            return  userService.GetAlluser();
    }




}
