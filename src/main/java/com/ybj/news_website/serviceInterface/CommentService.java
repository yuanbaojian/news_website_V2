package com.ybj.news_website.serviceInterface;

import com.ybj.news_website.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import  com.ybj.news_website.mapper.CommentMapper;

import java.util.List;

public interface CommentService {



    public  void Insert(Comment comment);

    public List<Comment> SelectAll(Integer article_id);
}
