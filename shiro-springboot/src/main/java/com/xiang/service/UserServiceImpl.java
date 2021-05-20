package com.xiang.service;

import com.xiang.mapper.UserMapper;
import com.xiang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/20 21:48
 * @Desc：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}
