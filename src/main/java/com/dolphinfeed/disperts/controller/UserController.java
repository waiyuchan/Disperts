package com.dolphinfeed.disperts.controller;

import com.dolphinfeed.disperts.common.api.api.ApiResponse;
import com.dolphinfeed.disperts.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dolphinfeed.disperts.common.api.api.ErrorCode;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private AuthService authService;

    //    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@RequestBody UserRegisterRequest request) {
//        try {
//            userService.registerUser(request.getUsername(), request.getPassword());
//            return ResponseEntity.ok().build();
//        } catch (UserAlreadyExistsException e) {
//            return ResponseEntity.status(HttpStatus.CONFLICT).build();
//        }
//    }
//
    @PostMapping("/login")
    public ApiResponse<?> login(@RequestParam String username, @RequestParam String password, @RequestParam int loginMode) {
        try {
            String token = authService.login(username, password, loginMode);
            return ApiResponse.success(token);
        } catch (RuntimeException e) {
            return ApiResponse.failure(ErrorCode.USER_NOT_FOUND);
        }
    }
}
