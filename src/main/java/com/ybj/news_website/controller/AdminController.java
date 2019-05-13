package com.ybj.news_website.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.AdminService;
import com.ybj.news_website.serviceInterface.ArticleService;
import com.ybj.news_website.serviceInterface.UserService;
import groovyjarjarpicocli.CommandLine;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    UserService userService;

    @Autowired
    ArticleService articleService;


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


    @RequestMapping("/adminInfo")
    public String  adminInfo(HttpSession session, Model model)
    {
        Integer  user_id= (Integer ) session.getAttribute("user_id");
        Map<String,String> admin=userService.GetUserById(user_id);
        model.addAttribute("admin", admin);
        return "admin/adminInfo";
    }

    //跳转到修改页面
    @GetMapping("/adminInfo/{user_id}")
    public String toEditUserInfo(@PathVariable("user_id") Integer  user_id, Model model)
    {
        //我就使用userService,  更改信息没必要重写
        Map<String, String> user=userService.GetUserById(user_id);
        return "admin/editAdminInfo";
    }

    //获取全部未过审核文章
    @RequestMapping("/unCheckedArticles")
    public String articles(Model model, HttpSession session)
    {
        List<Map<String, String>> unCheckedArticles=articleService.GetUnChecked();
        model.addAttribute("unCheckedArticles", unCheckedArticles);

        return "admin/unCheckedArticles";
    }


    //跳转到修改页面
    @GetMapping("/unCheckedArticle/{article_id}")
    public String toEdit(@PathVariable("article_id") Integer article_id, Model model)
    {
        Article article=articleService.GetArticleByArticleId(article_id);
        model.addAttribute("article", article);
        return "admin/editUncheckedArticle";
    }


    //修改文章
    @PutMapping("/unCheckedArticle")
    public String  Edit(Article article)
    {
        articleService.Update(article);
        return "redirect:/articles";
    }



}
