package com.ybj.news_website.mapper;

import com.ybj.news_website.model.User;
import com.ybj.news_website.model.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {


    long countByExample(UserExample example);

    int deleteByExample(UserExample example);



    @Insert(" insert  into user(user_account,user_password,user_icon, user_email,role_id)" +
            " values(#{user_account},#{user_password},#{user_icon},#{user_email}, #{role_id}) ")
    public void InsertUser(User record);


    @Select("select * from user")
    public List<User> GetAllUser();


    @Select("select * from user where user_account= #{user_account} and " +
            "user_password= #{user_password}")
    List<Map<String, Object>> login(@Param("user_account") String user_account,
                                    @Param("user_password") String user_password);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}