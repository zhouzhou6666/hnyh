package com.zjh.controller;

import com.zjh.domain.AdminTable;

import com.zjh.service.AdminTableService;
import com.zjh.utils.AjaxResult;
import com.zjh.utils.JedisUtil;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;



@RestController
@RequestMapping(value="/login")
public class LoginController {

    @Autowired
    private AdminTableService loginService;

    @PostMapping(value = "/login")
    public AjaxResult login(String phone, String password) {
        AdminTable admin = loginService.login(phone, password);
        if (admin != null) {
            String token = String.valueOf((UUID.randomUUID()));
            if (JedisUtil.setRedisAll(token, 300L, admin.getName()) !=null) {
                admin.setToken(token);
                return AjaxResult.success("登录成功", admin);
            }

        }
        return AjaxResult.warn("登录失败");
    }
}
