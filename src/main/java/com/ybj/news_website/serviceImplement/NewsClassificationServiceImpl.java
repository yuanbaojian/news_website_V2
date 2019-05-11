package com.ybj.news_website.serviceImplement;
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
}
