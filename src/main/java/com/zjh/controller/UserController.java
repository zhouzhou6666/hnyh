package com.zjh.controller;

import com.zjh.domain.AdminTable;
import com.zjh.domain.SysUser;
import com.zjh.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(tags="用户")
public class UserController {
    @Autowired
    private SysUserService userService;

    @ApiOperation(value = "查询所有用户")
    @GetMapping(value="/findAll")
    public List<SysUser> finAll(String  phone){
        return userService.findAll(phone);
    }

    @ApiOperation(value = "模糊查询")
    @GetMapping(value="/likeAll")
    public List<SysUser> likeAll(SysUser sysUser){
        return userService.likeAll(sysUser);
    }

    @ApiOperation(value = "登记信息")
    @PostMapping(value="/register")
    public int register(SysUser sysUser){
        return userService.register(sysUser);
    }

    @ApiOperation(value = "删除用户")
    @GetMapping(value="/delById")
    public int delById(long userId){
        return userService.deleteById(userId);
    }

    @ApiOperation(value = "修改信息")
    @GetMapping(value="/updUser")
    public int updUser(SysUser sysUser){
        return userService.updUser(sysUser);
    }



}
