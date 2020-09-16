package com.hewei.controller;

import com.hewei.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference
    UserService userService;

    @GetMapping("getUserName")
    public String getUserName() {
        return userService.getUserName("hewei");
    }
}
