package com.ybj.news_website.serviceInterface;

import com.ybj.news_website.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import  com.ybj.news_website.mapper.CommentMapper;

import java.util.List;
import java.util.Map;

public interface CommentService {



    public  void Insert(Comment comment);

    public List<Map<String,String>> SelectAll(Integer article_id);

    public void deleteByArticle(Integer article_id);
}
