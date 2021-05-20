package com.xiang.service;

import com.xiang.pojo.User;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/20 21:47
 * @Desc：
 */
public interface UserService {

    public User queryUserByName(String name);
}
