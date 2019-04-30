package com.ybj.news_website.implement;

import com.ybj.news_website.model.User;
import com.ybj.news_website.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.ybj.news_website.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> GetAlluser() {
        List<User> users= userMapper.GetAllUser();
        return users;
    }
}
