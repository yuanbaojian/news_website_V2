package com.ybj.news_website.implement;

import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.ybj.news_website.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> GetAlluser() {
        List<User> users= userMapper.GetAllUser();
        return users;
    }


    //插入用户
    @Override
    public Map<String,String> InsertUser(User user) {
        Map<String, String> map = new HashMap<>();
        userMapper.InsertUser(user);
        map.put("ok", "注册完成");
        return map;
    }

    @Override
    public  List<Map<String, Object>>  login(String user_account, String user_password) {
        List<Map<String, Object>> list=userMapper.login(user_account,user_password);
        return list;
    }


}
