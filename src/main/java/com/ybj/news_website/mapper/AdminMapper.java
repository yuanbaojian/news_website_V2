package com.ybj.news_website.mapper;

import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.User;
import javafx.print.Collation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AdminMapper {

    @Select("select * from news_classification")
    public Collection<News_classification> GetNewsClassification();


}
