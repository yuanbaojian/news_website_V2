package com.ybj.news_website.controller;

import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ybj.news_website.util.Response;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    //去往登陆页面
    @RequestMapping("/tologin")
    public String toLogin(){
        return "user/login";
    }

    //去往注册页面
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "user/register";
    }


    @RequestMapping("/test")
    public  String test()
    {
        return "test";
    }


    @RequestMapping("/register")
    public ModelAndView register(String user_account, String  user_password, String user_email)
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


    @RequestMapping("/login")
    public ModelAndView login(String user_account, String user_password){

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user_account", user_account);


        User user=new User();
        user.setUser_account(user_account);
        List<Map<String, Object>> list=userService.login(user_account, user_password);
        int role_id= (int)list.get(0).get("role_id");
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
