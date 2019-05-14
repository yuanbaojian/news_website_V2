package com.ybj.news_website.serviceImplement;

import com.ybj.news_website.mapper.AdminMapper;
import com.ybj.news_website.mapper.UserMapper;
import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.ybj.news_website.mapper.ArticleMapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    ArticleMapper articleMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public Collection<News_classification> GetNewsClassification() {

        return adminMapper.GetNewsClassification();
    }

//    @Override
//    public Collection<Article> GetArticle() {
//        return  articleMapper.GetArticle();
//    }

    @Override
    public  List<Map<String, String>> GetUser() {
        return userMapper.GetAllUser();
    }

    @Override
    public User GetAdmin(Integer user_id) {
         return userMapper.GetUserById(user_id);
    }

    @Override
    public void check(Integer article_id) {
        articleMapper.check(article_id);
    }
}
