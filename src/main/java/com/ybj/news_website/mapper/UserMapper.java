package com.ybj.news_website.mapper;

import com.ybj.news_website.model.User;
import com.ybj.news_website.model.UserExample;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;


@Mapper
public interface UserMapper {


    long countByExample(UserExample example);

    int deleteByExample(UserExample example);



    @Insert(" insert  into user(user_account,user_password,user_icon, user_email,role_id)" +
            " values(#{user_account},#{user_password},#{user_icon},#{user_email}, #{role_id}) ")
    public void InsertUser(User record);



    @Select("select user_id, user_account, user_icon,user_email, role_id from user  " )
    public List<Map<String, String>> GetAllUser();


//    查询自己信息
    @Select("select user_id, user_account, user_icon,user_email, role_id from user  where user_id=#{user_id} " )
    public Map<String, String> GetUserById(Integer   user_id);

    @Update(" update user set user_icon=#{user_icon}," +
            "user_email=#{user_email}," +
            "  where user_id=#{user_id}")
    void Update(@Param("user") User user);


//登陆使用
    @Select("select * from user where user_id= #{user_id} and " +
            "user_password= #{user_password}")
    List<Map<String, Object>> login(@Param("user_id") int user_id,
                                    @Param("user_password") String user_password);



    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}