package com.ybj.news_website.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.AdminService;
import com.ybj.news_website.serviceInterface.UserService;
import groovyjarjarpicocli.CommandLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    UserService userService;


    /**
     * 将后台的数据放到前台显示
     * 估计需要用到ajax ,jQuery
     * @return
     */
    @GetMapping("/showClassification")
    @ResponseBody
    public Object  showClassification()
    {

        Collection<News_classification>  news_classifications= adminService.GetNewsClassification();
        //从数据库查询到的 json 数据
        ModelAndView modelAndView=  new ModelAndView();
        //modelAndView.setViewName("admin/news_classification");
        return  news_classifications;
    }


//    @GetMapping("/showArticle")
//    @ResponseBody
//    public Object  showArticle()
//    {
//
//        Collection<Article>  articles= adminService.GetArticle();
//        //从数据库查询到的 json 数据
//        ModelAndView modelAndView=  new ModelAndView();
//        //modelAndView.setViewName("admin/news_classification");
//        return  articles;
//    }


    @GetMapping("/showUser")
    @ResponseBody
    public Object User(){
        return  userService.GetAlluser();
    }

}
