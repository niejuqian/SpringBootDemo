package com.laonie.demo.service.service.impl;

import com.laonie.demo.service.entity.UserEntity;
import com.laonie.demo.service.jpa.UserReppsitory;
import com.laonie.demo.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by niejiuqian on 2017/9/11.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    public UserReppsitory userReppsitory;

    @Override
    public UserEntity findUserByMobile(String mobile) {
        return userReppsitory.findByMobile(mobile);
    }
}
