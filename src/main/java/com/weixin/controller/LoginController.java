package com.weixin.controller;

import com.weixin.service.LoginService;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login/{code}")
    public void login(@PathVariable("code") String code) {
        try {
            loginService.login(code);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }
}
