package com.ybj.news_website.Mapper;

import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.News_classificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface News_classificationMapper {

    @Select("select * from news_classification")
    void getAll();


    long countByExample(News_classificationExample example);

    int deleteByExample(News_classificationExample example);

    int deleteByPrimaryKey(Integer classification_id);

    int insert(News_classification record);

    int insertSelective(News_classification record);

    List<News_classification> selectByExample(News_classificationExample example);

    News_classification selectByPrimaryKey(Integer classification_id);

    int updateByExampleSelective(@Param("record") News_classification record, @Param("example") News_classificationExample example);

    int updateByExample(@Param("record") News_classification record, @Param("example") News_classificationExample example);

    int updateByPrimaryKeySelective(News_classification record);

    int updateByPrimaryKey(News_classification record);
}