package com.ybj.news_website.serviceImplement;

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
    UserMapper  userMapper;

    @Override
    public int getUserNum() {
        return userMapper.getUserNum();
    }

    @Override
    public List<Map<String, String>> GetAlluser() {
        List<Map<String, String>> users= userMapper.GetAllUser();
        return users;
    }


    @Override
    public User GetUserById(Integer  user_id) {
        User user= userMapper.GetUserById(user_id);
        return user;
    }


    //插入用户
    @Override
    public void InsertUser(User user) {
        userMapper.InsertUser(user);
    }

    @Override
    public  User  login(Integer  user_id, String user_password) {
        User list=userMapper.login(user_id,user_password);
        return list;
    }

    @Override
    public void Update(User user) {
        userMapper.Update(user);
    }

    @Override
    public boolean checkPwd(String oldPwd, Integer user_id) {
        String pwd=userMapper.checkPwd(user_id);
        return oldPwd.equals(pwd);
    }

    @Override
    public void changePwd(String user_password ,Integer user_id) {
        userMapper.changePwd(user_password,user_id);
    }


}
