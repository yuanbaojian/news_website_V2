package com.ybj.news_website.serviceImplement;
import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.serviceInterface.NewsClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import   com.ybj.news_website.Mapper.News_classificationMapper;

import java.util.List;
import java.util.Map;

@Service
public class NewsClassificationServiceImpl  implements NewsClassificationService {

    @Autowired
    News_classificationMapper news_classificationMapper;

    @Override
    public List<Map<String, String>> GetAll() {
        return news_classificationMapper.getAll();
    }

    @Override
    public List<Map<String, String>> GetFive() {
        return news_classificationMapper.getFive();
    }

    @Override
    public void Insert(News_classification news_classification) {
        news_classificationMapper.Insert(news_classification);
    }

    @Override
    public Map<String, String> GetById(Integer classification_id) {
        return news_classificationMapper.GetById(classification_id);
    }

    @Override
    public void Update(News_classification news_classification) {
        news_classificationMapper.Update(news_classification);
    }

    @Override
    public void Delete(Integer classification_id) {
        news_classificationMapper.Delete(classification_id);
    }
}
