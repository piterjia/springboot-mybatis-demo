package com.piter.mall.user.service;

import com.piter.mall.user.dao.UserMapper;
import com.piter.mall.user.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加一个用户
     */
    public void addUser(User user) {
       userMapper.insert(user);
    }
}
