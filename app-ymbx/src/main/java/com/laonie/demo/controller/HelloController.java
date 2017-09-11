package com.laonie.demo.controller;

import com.laonie.demo.config.Config;
import com.laonie.demo.common.StringUtils;
import com.laonie.demo.user.entity.UserEntity;
import com.laonie.demo.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by niejiuqian on 2017/9/9.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    Config config;

    @Autowired
    private IUserService userService;

    @RequestMapping("/{name}")
    @ResponseBody
    public String sayHello(@PathVariable("name") String name){
        if (StringUtils.isEmpty(name)) {
            System.out.println("========================name is null");
        }
        System.out.println(config.getName() + "---" + config.getAge());
        UserEntity user = userService.findUserByMobile(name);
        System.out.println(user);
        return "hello" + name;
    }
}
