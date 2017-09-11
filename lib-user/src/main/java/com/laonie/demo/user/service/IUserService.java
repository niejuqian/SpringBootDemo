package com.laonie.demo.user.service;

import com.laonie.demo.user.entity.UserEntity;

/**
 * Created by niejiuqian on 2017/9/11.
 */
public interface IUserService {
    public UserEntity findUserByMobile(String mobile);
}
