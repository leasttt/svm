package com.master.svmDemo.controller;

import com.master.svmDemo.model.User;
import com.master.svmDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tanzheng on 16/8/8.
 */
@Controller
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public String showUser(String id, ModelMap modelMap){
        //1.调用BLL层的服务接口
        User user = userService.getUser(id);
        //2.设置模型数据
        modelMap.put("user",user);
        //3.返回逻辑视图名称
        return "showUser";
    }

    @RequestMapping(value = "/showUser2",method = RequestMethod.GET)
    public String showUser2(String id, ModelMap modelMap){
        //1.调用BLL层的服务接口
        User user = userService.getUser2(id, 50);
        //2.设置模型数据
        modelMap.put("user",user);
        //3.返回逻辑视图名称
        return "showUser";
    }

    @RequestMapping(value = "/showUser3",method = RequestMethod.GET)
    public String showUser3(int id, ModelMap modelMap){
        //1.调用BLL层的服务接口
        User user = userService.getUser3(id);
        //2.设置模型数据
        modelMap.put("user",user);
        //3.返回逻辑视图名称
        return "showUser";
    }
}
