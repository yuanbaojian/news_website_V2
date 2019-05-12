package com.ybj.news_website.Mapper;

import com.ybj.news_website.model.News_classification;
import com.ybj.news_website.model.News_classificationExample;
import java.util.List;
import java.util.Map;

import groovy.util.logging.Slf4j;
import org.apache.ibatis.annotations.*;

public interface News_classificationMapper {

    @Select("select * from news_classification")
    List<Map<String, String>>  getAll();


    @Select("select * from news_classification limit 5")
    List<Map<String, String>>  getFive();

    @Insert("insert into news_classification(classification_name) values(#{classification_name})")
    int Insert(News_classification news_classification);


    @Select("select * from news_classification where classification_id=#{classification_id}")
    Map<String,String> GetById(Integer classification_id);


    @Update("update news_classification set classification_name=#{classification_name} where classification_id=#{classification_id}")
    void Update(News_classification news_classification);


    @Delete("delete from news_classification where classification_id=#{classification_id}")
    void Delete(Integer classification_id);




    long countByExample(News_classificationExample example);

    int deleteByExample(News_classificationExample example);

    int deleteByPrimaryKey(Integer classification_id);



    int insertSelective(News_classification record);

    List<News_classification> selectByExample(News_classificationExample example);

    News_classification selectByPrimaryKey(Integer classification_id);

    int updateByExampleSelective(@Param("record") News_classification record, @Param("example") News_classificationExample example);

    int updateByExample(@Param("record") News_classification record, @Param("example") News_classificationExample example);

    int updateByPrimaryKeySelective(News_classification record);

    int updateByPrimaryKey(News_classification record);
}