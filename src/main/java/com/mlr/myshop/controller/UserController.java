package com.mlr.myshop.controller;

import com.mlr.myshop.pojo.User;
import com.mlr.myshop.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    Map<String, Object> map = new HashMap<>();

    //用户登录
    @PostMapping("/login")
    public Map<String, Object> login(User user) {
        User username = userService.login(user);
        if (username != null) {
            map.put("code", 200);
            map.put("message", "登陆成功");
        } else {
            map.put("code", 0);
            map.put("message", "用户名或密码错误");
        }
        return map;
    }

    //用户列表+分页
    @PostMapping("/getAllUserList")
    public Map<String, Object> getAllUserList(int currentPage, int pageSize) {
        HashMap map = new HashMap();
        Map<String, Object> remap = new HashMap<>();
        int pageStart = (currentPage - 1) * pageSize;
        map.put("pageStart", pageStart);
        map.put("pageSize", pageSize);
        List<User> user = userService.getAllUserList(map);
        if (user != null) {
            remap.put("code", 200);
            remap.put("data", user);
        } else {
            remap.put("code", 0);
            remap.put("message", "请登录");
        }
        return remap;
    }

    @PostMapping("/getUserListById")
    public Map<String, Object> getUserListById(Integer id) {
        List<User> user = userService.getUserListById(id);
        if (user != null) {
            map.put("data", user);
        }
        return map;
    }

    @PostMapping("/getUserListByName")
    public Map<String, Object> getUserListByName(String name) {
        List<User> user = userService.getUserListByName(name);
        if (user != null) {
            map.put("data", user);
        }
        return map;
    }

    @PostMapping("/getUserListCount")
    public Map<String, Object> getUserListCount() {
        Integer count = userService.getUserListCount();
        if (count != null) {
            map.put("data", count);
        }
        return map;
    }

    //增加新用户
    @PostMapping("/insertUser")
    public Map<String, Object> insertUser(User user) {
        Integer insertUser = userService.insertUser(user);
        if (insertUser != null) {
            map.put("code", 200);
            map.put("message", "添加成功");
        }
        return map;
    }

    //按ID删除用户
    @PostMapping("/deleteUserById")
    public Map<String, Object> deleteUserById(Integer id) {
        Integer deleteUserById = userService.deleteUserById(id);
        if (deleteUserById != 0) {
            map.put("code", 200);
            map.put("message", "删除成功");
        } else {
            map.put("code", 0);
            map.put("message", "删除失败");
        }
        return map;
    }

    //批量删除用户
//    @PostMapping("/deleteUserAllId")
//    public Map<String, Object> deleteUserAllId(int[] ids) {
//        int deleteUserAllId = userService.deleteUserAllId(ids);
//        if (deleteUserAllId != 0) {
//            map.put("code", 200);
//            map.put("message", "更新成功");
//        } else {
//            map.put("code", 0);
//            map.put("message", "更新失败");
//        }
//        return map;

//    }

    //更新用户
    @PostMapping("/updateUser")
    public Map<String, Object> updateUser(User user) {
        int updateUser = userService.updateUser(user);
        if (updateUser != 0) {
            map.put("code", 200);
            map.put("message", "更新成功");
        } else {
            map.put("code", 0);
            map.put("message", "更新失败");
        }
        return map;
    }
}
