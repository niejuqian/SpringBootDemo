package com.laonie.demo.service.service;

import com.laonie.demo.service.entity.UserEntity;

/**
 * Created by niejiuqian on 2017/9/11.
 */
public interface IUserService {
    UserEntity findUserByMobile(String mobile);
}
