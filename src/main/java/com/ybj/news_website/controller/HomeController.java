package com.ybj.news_website.controller;

import com.ybj.news_website.serviceInterface.NewsClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    NewsClassificationService newsClassificationService;

    @RequestMapping("/")
    public String index(Model model)
    {
        List<Map<String,String>> classification= newsClassificationService.GetFive();
        model.addAttribute("classification", classification);
        return "home/index";
    }

    @RequestMapping("/tologin")
    public String tologin()
    {
        return "common/login";
    }

    @RequestMapping("/toRegister")
    public String toRegister()
    {
        return "commom/register";
    }







}
