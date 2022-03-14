package com.mlr.myshop.service;

import com.mlr.myshop.mapper.UserMapper;
import com.mlr.myshop.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

//    @Override
//    public User login(User user) {
//        return userMapper.login(user);
//    }

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }

    @Override
    public List<User> getAllUserList(HashMap map) {
        return userMapper.getAllUserList(map);
    }

    @Override
    public List<User> getUserListById(Integer id) {
        return userMapper.getUserListById(id);
    }

    @Override
    public List<User> getUserListByName(String name) {
        return userMapper.getUserListByName(name);
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
