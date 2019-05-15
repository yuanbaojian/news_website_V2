package com.ybj.news_website.controller;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.serviceInterface.ArticleService;
import com.ybj.news_website.serviceInterface.NewsClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @Autowired
    NewsClassificationService newsClassificationService;

    //获取全部文章
    @RequestMapping("/articles")
    public String articles(Model model, HttpSession session)
    {
        Integer  user_id= (Integer ) session.getAttribute("user_id");
        List<Map<String, String>> articles=articleService.GetArticleByUserId(user_id);
        model.addAttribute("articles", articles);

        return "article/list";
    }



//    //    修改文章信息
//    @GetMapping("/article/{article_id}")
//    public String EditUserInfo(@PathVariable("article_id") Integer  article_id, Model model)
//    {
//        //应该用单个获取， list<map>不适合了， 取名也不对
//        List<Map<String, String>> user=articleService.GetArticleByArticleId(article_id);
//        return "article/add";
//    }


    //去添加文章页面
    @GetMapping("/article")
    public String ToAdd(Model model)
    {
        List<Map<String,String>> classification =newsClassificationService.GetAll();
        model.addAttribute("classification", classification);
        return  "article/add";
    }

//    添加文章
    @PostMapping("/addArticle")
    public String add(Article article, HttpSession session)
    {
        Integer  user_id= (Integer ) session.getAttribute("user_id");


        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(d);

        article.setArticle_created_time(date);
        article.setChecked(0);
        articleService.Insert(article, user_id);
        return "redirect:/articles";
    }

    //跳转到修改页面
    @GetMapping("/Aarticle")
    public String toEdit( Integer article_id, Model model)
    {
        Article article=articleService.GetArticleByArticleId(article_id);
        List<Map<String,String>> classification=newsClassificationService.GetAll();
        model.addAttribute("article", article);
        model.addAttribute("classification", classification);
        return "article/edit";
    }



    //修改文章
    @PutMapping("/article")
    public String  Edit(Article article)
    {
        articleService.Update(article);
        return "redirect:/articles";
    }

    @DeleteMapping("/article/{article_id}")
    public String Delete(@PathVariable("article_id") Integer article_id)
    {
            articleService.Delete(article_id);
            return "redirect:/articles";
    }
}
