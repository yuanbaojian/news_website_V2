package com.ybj.news_website.serviceInterface;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.ybj.news_website.mapper.UserMapper;
import com.ybj.news_website.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {

    public List<Map<String, String>> GetAlluser();

    public User GetUserById(Integer  user_id);

    public Map<String,String> InsertUser(User user);

    public List<Map<String, Object>> login(Integer  user_id, String user_password);

    public  void Update(User user);


}
