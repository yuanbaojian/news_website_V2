package com.ybj.news_website.Mapper;

import com.ybj.news_website.model.User;
import com.ybj.news_website.model.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    long countByExample(UserExample example);

    int deleteByExample(UserExample example);



    @Insert(" insert into user(user_account,user_password,user_email) values(#{user_account},#{user_password},#{user_email}) ")
    public void InsertUser(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}