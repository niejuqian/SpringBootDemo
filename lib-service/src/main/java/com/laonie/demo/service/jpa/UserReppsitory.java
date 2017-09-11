package com.laonie.demo.service.jpa;

import com.laonie.demo.service.entity.UserEntity;
import org.springframework.data.repository.Repository;

/**
 * Created by niejiuqian on 2017/9/11.
 */
public interface UserReppsitory extends Repository<UserEntity,String> {
    UserEntity findByMobile(String mobile);
}
