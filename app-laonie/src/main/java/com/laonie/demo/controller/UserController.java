package com.laonie.demo.controller;

import com.laonie.demo.mq.HelloSender1;
import com.laonie.demo.service.dto.UserDto;
import com.laonie.demo.service.entity.UserEntity;
import com.laonie.demo.service.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by niejiuqian on 2017/9/11.
 */
@Api(description = "用户管理")
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService userService;
    @Autowired
    private HelloSender1 helloSender1;


    @ApiOperation(value = "查询用户信息",notes = "传入用户手机号码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile",value = "手机号码",required = true,dataType = "String")
    })
    @GetMapping("/{mobile}")
    @ResponseBody
    public UserEntity findUserInfo(@PathVariable("mobile") String mobile){
        return userService.findUserByMobile(mobile);
    }

    @ApiOperation(value = "新增/编辑用户信息")
    @PostMapping("/update")
    public Object update(@Valid @RequestBody UserDto dto, BindingResult result){
        if (result.hasErrors()) {
            throw new RuntimeException(result.getAllErrors().get(0).getDefaultMessage());
        }
        return null;
    }

    @ApiOperation(value = "MQ测试")
    @GetMapping("/test/mq")
    public Object testMq(){
        helloSender1.send();
        return null;
    }
}
