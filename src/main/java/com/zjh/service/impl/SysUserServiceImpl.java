package com.zjh.service.impl;

import cn.hutool.Hutool;
import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjh.domain.SysUser;
import com.zjh.service.SysUserService;
import com.zjh.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
* @author Administrator
* @description 针对表【sys_user(用户信息表)】的数据库操作Service实现
* @createDate 2022-11-01 19:26:46
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int register(SysUser sysUser) {

        sysUser.setRegisterTime(new DateTime());
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int deleteById(long userId) {
        return sysUserMapper.deleteById(userId);
    }

    @Override
    public int updUser(SysUser sysUser) {
        return sysUserMapper.updateById(sysUser);
    }

    @Override
    public List<SysUser> findAll(String phone) {
        return sysUserMapper.findAll(phone);
    }

    @Override
    public List<SysUser> likeAll(SysUser sysUser) {
        return sysUserMapper.likeAll(sysUser);
    }


}




