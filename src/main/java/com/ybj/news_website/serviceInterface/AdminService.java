package com.ybj.news_website.serviceInterface;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface AdminService {


    public Collection<News_classification> GetNewsClassification();


//    public Collection<Article> GetArticle();


    public  List<Map<String, String>> GetUser();

    public User GetAdmin(Integer user_id);


    public  void check(Integer article_id);
}
