package com.ybj.news_website.mapper;

import com.ybj.news_website.model.Article;
import com.ybj.news_website.model.ArticleExample;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;

@Mapper
public interface ArticleMapper {

    @Select("select  count(*) from article")
    int getArticleNum();

    @Select("select * from article where user_id=#{user_id}")
    List<Map<String, String>> GetArticleByUserId(Integer user_id);

    //放到前台， 按时间排序
    @Select("select * from article a ,news_classification b " +
            " where  a.classification_id=b.classification_id and a.checked=1 order by a.article_created_time desc")
    List<Map<String, String>>  GetAllByTime();

    //放到前台， 按评论数排序
    @Select("select a.*, b.user_account from (SELECT *, count(*) AS count " +
            "FROM  (select a.* from article a RIGHT JOIN comment b on a.article_id= b.article_id and a.checked=1 ) c " +
            "GROUP BY c.article_id " +
            "ORDER BY count DESC " +
            "LIMIT 20) a, user b where  a.user_id=b.user_id")
    List<Map<String, String>>  GetAllByComment();



    //模糊搜索
    @Select("select * from article a ,news_classification b " +
            " where article_name like CONCAT('%',#{keyword},'%') and " +
            " a.classification_id=b.classification_id  and a.checked=1")
    List<Map<String ,String>>  fuzzySearch(String keyword);

    //查询未审核的文章
    @Select("select a.* , b.classification_name from article a, news_classification b " +
            " where checked=0 and a.classification_id=b.classification_id")
    List<Map<String, String>> GetUnchecked();


    //按分类搜索新闻
    @Select("select * from article a ,news_classification b" +
            " where a.classification_id=#{classification_id} and " +
            "a.classification_id=b.classification_id and a.checked=1")
    List<Map<String, String>> GetAllByClass(Integer classification_id);


    @Select("select * from article where article_id=#{article_id}")
    Article GetArticleByArticleId(Integer article_id);


    @Insert("insert into article(article_name,article_context,user_id," +
            "article_img1,article_img2,article_img3,article_img4 , classification_id," +
            "article_created_time,checked) " +
            "values(#{article.article_name},#{article.article_context},#{user_id},#{article.article_img1}," +
            "#{article.article_img2},#{article.article_img3},#{article.article_img4},#{article.classification_id}" +
            ", #{article.article_created_time},#{article.checked})" )
    int insert(@Param("article") Article article, @Param("user_id")Integer user_id);


//    //还未成功， 假装成功， 看下一步骤
//    @Insert("insert into article(user_id) values( #{user_id})" )
//    void insert(@Param("article") Article article, @Param("user_id") Integer user_id);
    @Update(" update article set article_name=#{article_name}," +
            "article_context=#{article_context}," +
            "classification_id=#{classification_id} " +
            "  where article_id=#{article_id}")
    void update(Article article);

    @Update(" update article set checked=1 " +
            "  where article_id=#{article_id}")
    void checkArticle(Integer article_id);


    @Delete("delete from article where article_id=#{article_id}")
    void delete(Integer article_id);



    long countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer article_id);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(Integer article_id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}