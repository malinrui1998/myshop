package com.mlr.myshop.mapper;


import com.mlr.myshop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;


@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user where user_name=#{user_name} and password=#{password}")
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
