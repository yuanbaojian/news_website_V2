package com.ybj.news_website.controller;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.serviceInterface.ArticleService;
import com.ybj.news_website.serviceInterface.CommentService;
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

    @Autowired
    CommentService commentService;

    //获取个人全部文章
    @RequestMapping("/articles")
    public String articles(Model model, HttpSession session)
    {
        Integer  user_id= (Integer ) session.getAttribute("user_id");
        List<Map<String, String>> articles=articleService.GetArticleByUserId(user_id);
        model.addAttribute("articles", articles);

        return "article/list";
    }





    //去添加文章页面
    @GetMapping("/article")
    public String ToAdd(Model model)
    {
        List<Map<String,String>> classification =newsClassificationService.GetAll();
        model.addAttribute("classification", classification);
        return  "article/addByUeditor";
    }

//    添加文章
    @PostMapping("/addArticle")
    public String add(Article article, HttpSession session)
    {
        Integer  user_id= (Integer ) session.getAttribute("user_id");


        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(d);
        article.setUser_id(user_id);
        article.setArticle_created_time(date);
        article.setChecked(0);
        article.setClicked(0);
        articleService.Insert(article, user_id);
        return "redirect:/articles";
    }

    //跳转到修改页面
    @GetMapping("/Aarticle")
    public String toEdit( Integer article_id, Model model)
    {
        Map<String ,String> article=articleService.GetArticleByArticleId2(article_id);
        List<Map<String,String>> classification=newsClassificationService.GetAll();
        model.addAttribute("article", article);
        model.addAttribute("classification", classification);
        return "article/editByEditor";
    }



    //修改文章
    @RequestMapping("/editArticle")
    public String  Edit(Article article)
    {
        articleService.Update(article);
        return "redirect:/articles";
    }

    //删除文章
    @DeleteMapping("/article/{article_id}")
    public String Delete(@PathVariable("article_id") Integer article_id)
    {
        //先删除评论

            commentService.deleteByArticle(article_id);
            articleService.Delete(article_id);
            return "redirect:/articles";
    }
}
