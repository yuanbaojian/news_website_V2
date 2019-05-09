package com.ybj.news_website.serviceInterface;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

public interface AdminService {


    public Collection<News_classification> GetNewsClassification();


    public Collection<Article> GetArticle();


    public  Collection<User> GetUser();
}
