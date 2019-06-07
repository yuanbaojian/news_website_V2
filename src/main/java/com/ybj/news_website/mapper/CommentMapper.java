package com.ybj.news_website.mapper;

import com.ybj.news_website.model.Comment;
import com.ybj.news_website.model.CommentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CommentMapper {

    @Insert("insert into comment(created_time, content, article_id, user_id) " +
            " values(#{comment.created_time}, #{comment.content}, #{comment.article_id}," +
            "#{comment.user_id})")
    int Insert(@Param("comment") Comment comment);


    @Select("select c.*, u.user_account from comment c , user u " +
            " where article_id=#{article_id} and c.user_id=u.user_id " +
            "order by created_time desc")
    List<Map<String,String>> SelectAll(Integer article_id);


    @Delete("delete  from comment where article_id=#{article_id}")
    void deleteByArticle(Integer article_id);

    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);



    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);
}