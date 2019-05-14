package com.ybj.news_website.controller;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.News_classification;
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
public class NewsClassificationController {

    @Autowired
    NewsClassificationService newsClassificationService;

    //获取全部分类
    @RequestMapping("/news_classifications")
    public String articles(Model model)
    {
        List<Map<String, String>> news_classifications=newsClassificationService.GetAll();
        model.addAttribute("news_classifications", news_classifications);

        return "admin/news_classification";
    }

    //去添加分类页面
    @GetMapping("/toAddNews_classification")
    public String ToAdd(Model model)
    {
        //这个就不需要 回显数据了吧
        return  "admin/addNewsClassification";
    }

    //    添加分类
    @PostMapping("/addNewsClassification")
    public String add(News_classification news_classification, HttpSession session)
    {
        newsClassificationService.Insert(news_classification);
        return "redirect:/news_classifications";
    }



    //跳转到分类修改页面
    @GetMapping("/toEditNews_classification")
    public String toEdit( Integer classification_id, Model model)
    {
        Map<String,String> article=newsClassificationService.GetById(classification_id);
        Map<String,String> classification=newsClassificationService.GetById(classification_id);
        model.addAttribute("classification", classification);
        return "admin/editNewsClassification";
    }


    //修改分类
    @PutMapping("/editNews_classification")
    public String  Edit(News_classification news_classification)
    {
        newsClassificationService.Update(news_classification);
        return "redirect:/news_classifications";
    }


    @DeleteMapping("/news_classification/{classification_id}")
    public String Delete(@PathVariable("classification_id") Integer classification_id)
    {
        newsClassificationService.Delete(classification_id);
        return "redirect:/news_classifications";
    }


}
