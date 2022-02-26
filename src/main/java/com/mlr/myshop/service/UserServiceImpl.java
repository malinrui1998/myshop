package com.mlr.myshop.service;

import com.mlr.myshop.mapper.UserMapper;
import com.mlr.myshop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<User> getAllUserList(HashMap map) {
        return userMapper.getAllUserList(map);
    }

    @Override
    public Integer getUserListCount() {
        return userMapper.getUserListCount();
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
//
//    @Override
//    public int deleteUserAllId(int[] ids) {
//        return userMapper.deleteUserAllId(ids);
//    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }


}
