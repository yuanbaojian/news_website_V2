package com.ybj.news_website.controller;

import com.ybj.news_website.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ybj.news_website.util.Response;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@Controller

public class UserController {

    @Autowired
    UserService userService;

    //去往登陆页面
    @RequestMapping("/tologin")
    public String toLogin(){
        return "login";
    }


    @RequestMapping("/test")
    public  String test()
    {
        return "test";
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
