package com.xiang.mapper;

import com.xiang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/20 21:38
 * @Desc：
 */
@Repository
@Mapper
public interface UserMapper {
    public User queryUserByName(String name);
}
