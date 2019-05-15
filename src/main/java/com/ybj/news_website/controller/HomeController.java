package com.ybj.news_website.controller;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.User;
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



    @RequestMapping("/indexByClass")
    public String indexByClass(Model model, Integer classification_id)
    {
        List<Map<String,String>> classification= newsClassificationService.GetFive();
        model.addAttribute("classification", classification);

        List<Map<String,String>> articles= articleService.GetAllByClass(classification_id);
        model.addAttribute("articles", articles);

        return "home/index";
    }

    @RequestMapping("/tologin")
    public String tologin()
    {
        return "common/login";
    }


    @RequestMapping("/toEdit")
    public String toEdit()
    {
        return "edit";
    }

    @RequestMapping("/toRegister")
    public String toRegister()
    {
        return "common/register";
    }

//跳转到详情页， 显示具体的新闻内容
    @RequestMapping("/showArticle")
    public String  Show(Model model, int article_id)
    {
        Article article=articleService.GetArticleByArticleId(article_id);

        int user_id=article.getUser_id();

        //因为是map<String, String>导致 不能取到int类型
        //String user_id=(String) article.get("user_id");
         User user=userService.GetUserById(user_id);

        model.addAttribute("article", article);
        model.addAttribute("user", user);

        return "home/article";
    }


    @RequestMapping("/search")
    public String  showSearch(Model model, String keyword)
    {
        List<Map<String ,String>> articles=articleService.search(keyword);
        model.addAttribute("articles", articles);

        return "home/index";
    }






}
