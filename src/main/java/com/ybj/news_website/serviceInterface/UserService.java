package com.ybj.news_website.serviceInterface;

import java.util.List;
import java.util.Map;

import com.ybj.news_website.mapper.UserMapper;
import com.ybj.news_website.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    public List<User> GetAlluser();

    public Map<String,String> InsertUser(User user);

    public List<Map<String, Object>> login(String user_account, String user_password);



}
