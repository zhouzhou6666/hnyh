package com.zjh.service;

import com.zjh.domain.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【sys_user(用户信息表)】的数据库操作Service
* @createDate 2022-11-01 19:26:46
*/
public interface SysUserService extends IService<SysUser> {
    int register(SysUser sysUser);

    int deleteById(long userId);

    int updUser(SysUser sysUser);

    List<SysUser> findAll(String phone);

    List<SysUser> likeAll(SysUser sysUser);


}
