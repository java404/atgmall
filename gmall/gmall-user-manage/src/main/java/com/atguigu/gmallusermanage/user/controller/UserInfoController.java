package com.atguigu.gmallusermanage.user.controller;

import com.atguigu.gmallusermanage.user.bean.UserInfo;
import com.atguigu.gmallusermanage.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    //http://localhost:8080/selectAll
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<UserInfo> selectAll(){

        return userInfoService.selectAll();
    }

    //http://localhost:8080/selectUserById
    @RequestMapping("/selectUserById")
    @ResponseBody
    public UserInfo selectUserById(String id){

        return userInfoService.selectUserById(id);
    }

    //http://localhost:8080/selectUserByName
    @RequestMapping("/selectUserByName")
    @ResponseBody
    public List<UserInfo> selectUserByName(String name){

        return userInfoService.selectUserByName(name);
    }

    //http://localhost:8080/selectUserByAll
    @RequestMapping("/selectUserByAll")
    @ResponseBody
    public List<UserInfo> selectUserByAll(UserInfo userInfo){

        return userInfoService.selectUserByAll(userInfo);
    }

    //http://localhost:8080/selectUserLikeName
    @RequestMapping("/selectUserLikeName")
    @ResponseBody
    public List<UserInfo> selectUserLikeName(String name){

        return userInfoService.selectUserLikeName(name);
    }

    //http://localhost:8080/insertUser
    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(UserInfo userInfo){

        userInfoService.insertUser(userInfo);
        return "添加ok";
    }

    //http://localhost:8080/updateUserById
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(UserInfo userInfo){

        userInfoService.updateUserById(userInfo);
        return "修改ok";
    }

    //http://localhost:8080/deleteUserById
    @RequestMapping("/deleteUserById")
    @ResponseBody
    public String deleteUserById(UserInfo userInfo){

        userInfoService.deleteUserById(userInfo);
        return "删除ok";
    }

}
