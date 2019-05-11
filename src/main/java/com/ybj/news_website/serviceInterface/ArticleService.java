package com.ybj.news_website.serviceInterface;

import com.ybj.news_website.model.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService {

    public List<Map<String, String>> GetArticleByUserId(Integer  user_id);

    public Map<String, String> GetArticleByArticleId(Integer  article_id);

    public void Insert(Article article, Integer user_id);

    public void Update(Article article);

    public void Delete(Integer article_id);
}
