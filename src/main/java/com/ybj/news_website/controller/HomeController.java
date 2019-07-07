package com.ybj.news_website.controller;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.serviceInterface.ArticleService;
import com.ybj.news_website.serviceInterface.NewsClassificationService;
import com.ybj.news_website.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    NewsClassificationService newsClassificationService;

    @Autowired
    ArticleService articleService;

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(Model model)
    {
        List<Map<String,String>> classification= newsClassificationService.GetFive();
        model.addAttribute("classification", classification);

        List<Map<String,String>> articles= articleService.GetAllByTime();
        model.addAttribute("articles", articles);

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
        return "common/register";
    }

//跳转到详情页， 显示具体的新闻内容
    @RequestMapping("/showArticle/{article_id}")
    public String  Show(Model model, @PathVariable("article_id")int article_id)
    {
        Article article=articleService.GetArticleByArticleId(article_id);

        int user_id=article.getUser_id();

        //因为是map<String, String>导致 不能取到int类型
        //String user_id=(String) article.get("user_id");
         Map<String,String> user=userService.GetUserById(user_id);

        model.addAttribute("article", article);
        model.addAttribute("user", user);

        return "article/detail";
    }






}
