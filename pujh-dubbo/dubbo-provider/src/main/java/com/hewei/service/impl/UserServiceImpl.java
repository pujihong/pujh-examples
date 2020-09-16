package com.hewei.service.impl;

import com.hewei.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String userName) {
        return "姓名：" + userName;
    }
}
