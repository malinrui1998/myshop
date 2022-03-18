package com.mlr.myshop.service;


import com.mlr.myshop.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {

    User login(String username, String password);

    List<User> getAllUserList(HashMap map);

    List<User> getUserListById(Integer id);

    List<User> getUserListByName(String name);

    Integer getUserListCount();

    Integer insertUser(User user);

    Integer deleteUserById(Integer id);

    Integer deleteUserAllId(int[] ids);

    Integer updateUser(User user);
}
