package com.ybj.news_website.controller;

import com.ybj.news_website.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ybj.news_website.util.Response;
import java.util.Map;


@Controller
public class UserController {

    UserService userService;

    //去往登陆页面
    @RequestMapping("/tologin")
    public String toLogin(){
        return "app/login.html";
    }



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


}
