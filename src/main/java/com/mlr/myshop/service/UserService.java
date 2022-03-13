package com.mlr.myshop.service;


import com.mlr.myshop.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {

    User login(User user);

    List<User> getAllUserList(HashMap map);

    List<User> getUserListById(Integer id);

    List<User> getUserListByName(String name);

    Integer getUserListCount();

    Integer insertUser(User user);

    int deleteUserById(Integer id);

//    int deleteUserAllId(int[] ids);

    int updateUser(User user);
}
