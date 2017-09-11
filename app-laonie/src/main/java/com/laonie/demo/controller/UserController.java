package com.laonie.demo.controller;

import com.laonie.demo.common.StringUtils;
import com.laonie.demo.service.entity.UserEntity;
import com.laonie.demo.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by niejiuqian on 2017/9/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService userService;

    @GetMapping("/{mobile}")
    @ResponseBody
    public String findUserInfo(@PathVariable("mobile") String mobile){
        boolean flag = StringUtils.isEmpty(mobile);
        System.out.println("=============================>>>" + flag);
        UserEntity user = userService.findUserByMobile(mobile);
        System.out.println("==========>>>" + user);
        return "hello" + mobile;
    }
}
