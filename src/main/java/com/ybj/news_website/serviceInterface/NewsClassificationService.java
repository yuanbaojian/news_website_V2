package com.ybj.news_website.serviceInterface;

import com.ybj.news_website.model.News_classification;

import java.util.List;
import java.util.Map;

public interface NewsClassificationService {

    public List<Map<String, String>> GetAll();

    public List<Map<String, String>> GetFive();

    void Insert(News_classification news_classification);

    Map<String,String> GetById(Integer classification_id);

    void Update(News_classification news_classification);

    void Delete(Integer classification_id);

}
