package com.ybj.news_website.service;

import com.ybj.news_website.model.User;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.ybj.news_website.Mapper.UserMapper;

public class UserService {

    UserMapper userMapper;

    //注册
    public Map<String,String> registerUser(String user_account, String user_password, String user_email){
        Map<String, String> map = new HashMap<>();
        // 校验邮箱格式
        Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\\.[a-zA-Z0-9_-]{2,3}){1,2})$");
        Matcher m = p.matcher(user_email);
        if (!m.matches()) {
            map.put("regi-email-error", "请输入正确的邮箱");
            return map;
        }
        // 校验用户名长度
        if (StringUtils.isEmpty(user_account) || user_account.length() > 10) {
            map.put("regi-account-error", "用户名长度须在1-10个字符");
            return map;
        }

        // 校验密码长度
        p = Pattern.compile("^\\w{6,20}$");
        m = p.matcher(user_password);
        if (!m.matches()) {
            map.put("regi-password-error", "密码长度须在6-20个字符");
            return map;
        }

        //检测邮箱是否重复， 先不用
        /**
        int emailCount = UserMapper.selectEmailCount(user_email);
        if (emailCount > 0) {
            map.put("regi-email-error", "该邮箱已注册");
            return map;
        }
         **/
//        //使用md5加密（暂时不加）
//        String password=MyUtil.md5(user_password);
//        //设置未激活
//        String activate_code = MyUtil.createRandomCode();
//        //给用户发送邮件
//        taskExecutor.execute(new SendMail(activate_code, user_email, javaMailSender, 1));
        // 向数据库插入记录
        User user=new User();
        user.setUser_account(user_account);
        user.setUser_password(user_password);
        user.setUser_email(user_email);
        userMapper.InsertUser(user);
        map.put("ok", "注册完成");
        return map;
    }
}
