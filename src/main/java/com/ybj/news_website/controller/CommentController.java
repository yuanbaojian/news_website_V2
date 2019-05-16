package com.ybj.news_website.controller;

import com.ybj.news_website.model.Comment;
import com.ybj.news_website.serviceInterface.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.rmi.MarshalledObject;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CommentController {


    @Autowired
    CommentService commentService;

    @Autowired
    HomeController homeController;

    /**
     * 在获得评论后，需要的参数user_id, article_id
     * @param content
     * @return
     */
    @RequestMapping("/addComment")
    public String addComment(Model model,String content, HttpSession session)
    {
        Integer user_id= (Integer) session.getAttribute("user_id");
        Integer article_id=(Integer) session.getAttribute("article_id");
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(d);

        Comment comment=new Comment();
        comment.setContent(content);
        comment.setCreated_time(date);
        comment.setArticle_id(article_id);
        comment.setUser_id(user_id);

        commentService.Insert(comment);

        homeController.ShowArticle(model,article_id,session);

        return "home/article";
    }
}
