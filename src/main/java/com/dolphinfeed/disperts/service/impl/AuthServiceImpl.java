package com.dolphinfeed.disperts.service.impl;

import com.dolphinfeed.disperts.common.utils.JwtTokenUtil;
import com.dolphinfeed.disperts.mbg.model.User;
import com.dolphinfeed.disperts.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthServiceImpl implements AuthService {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public String login(String username, String password, int loginMode) {
        // 根据登录方式，查找用户信息
        User user = null;
//        if (loginMode == 1) {
//            user = userRepository.findByUsername(username);
//        } else if (loginMode == 2) {
//            user = userRepository.findByPhone(username);
//        } else if (loginMode == 3) {
//            user = userRepository.findByEmail(username);
//        }

        if (user == null || !password.equals(user.getPassword())) {
            throw new RuntimeException("用户名或密码不正确");
        }

        // 生成JWT Token
        return jwtTokenUtil.generateToken(user);
    }
}
