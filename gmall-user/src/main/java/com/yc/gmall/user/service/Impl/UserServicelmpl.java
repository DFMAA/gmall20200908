package com.yc.gmall.user.service.Impl;

import com.yc.gmall.user.mapper.UserMapper;
import com.yc.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    UserMapper userMapper;
}
