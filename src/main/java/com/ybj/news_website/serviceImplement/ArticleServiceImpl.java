package com.ybj.news_website.serviceImplement;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.serviceInterface.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.ybj.news_website.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Map<String, String>> GetArticleByUserId(Integer user_id) {
        List<Map<String, String>> articles= articleMapper.GetArticleByUserId(user_id);
        return articles;
    }

    @Override
    public Article GetArticleByArticleId(Integer article_id) {
        Article article= articleMapper.GetArticleByArticleId(article_id);
        return article;
    }

    @Override
    public void Insert(Article article, Integer user_id) {

        articleMapper.insert(article, user_id);
    }

    @Override
    public void Update(Article article) {
        articleMapper.update(article);
    }

    @Override
    public void Delete(Integer article_id) {
        articleMapper.delete(article_id);
    }

    @Override
    public List<Map<String, String>> GetUnChecked() {
        return articleMapper.GetUnchecked();
    }

    @Override
    public List<Map<String, String>> GetAllByTime() {
        return articleMapper.GetAllByTime();
    }

    @Override
    public List<Map<String ,String>> search(String keyword) {
        return articleMapper.fuzzySearch(keyword);
    }

    @Override
    public List<Map<String, String>> GetAllByClass(Integer classification_id) {
        return articleMapper.GetAllByClass(classification_id);
    }
}
