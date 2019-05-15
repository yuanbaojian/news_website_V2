package com.ybj.news_website.controller;

import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {

    @Autowired
    UserService userService;




    @RequestMapping("/test")
    public  String test()
    {
        return "edit";
    }


    @RequestMapping("/register")
    public ModelAndView register(String user_account, String  user_password, String user_email, HttpSession session)
    {

        User user=new User();
        user.setUser_account(user_account);
        user.setUser_password(user_password);
        user.setUser_email(user_email);
        user.setRole_id(1);
        Map<String,String> map=userService.InsertUser(user);



        userService.InsertUser(user);
        return new ModelAndView("/dashBoard.html");
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



        User user=new User();
      //  user.setUser_account(user_account);
        List<Map<String, Object>> list=userService.login(user_id, user_password);
        Integer  role_id= (Integer )list.get(0).get("role_id");
        String user_account= (String) list.get(0).get("user_account");
        session.setAttribute("user_account", user_account);
        session.setAttribute("user_id", user_id);
       // System.out.println(" role_id 为 " + list.get(0).get("role_id"));
        if (list.size()>0)
        {
            //跳转到用户管理页面
            if(role_id==1) {
                modelAndView.setViewName("user/dashBoard");
            }
            //跳转到管理员页面
            else {
                modelAndView.setViewName("admin/dashBoard");
            }
        }
        else {
            modelAndView.setViewName("/login");
        }
        return modelAndView;
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


//    跳转到修改页面
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

/**
    //跳转到注册页面
    @RequestMapping("/register")
    @ResponseBody
    public Response register(String user_account, String user_password, String user_email) {
        //service内容;
        Map<String,String> map=userService.registerUser(user_account,user_password,user_email);
        if (map.get("ok") != null) {
            return new Response(0, "系统已经向你的邮箱发送了一封邮件哦，验证后就可以登录啦~");
        } else {
            return new Response(1, "error", map);
        }
    }
**/

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
