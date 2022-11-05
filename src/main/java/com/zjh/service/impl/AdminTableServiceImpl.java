package com.zjh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjh.domain.AdminTable;
import com.zjh.domain.SysUser;
import com.zjh.service.AdminTableService;
import com.zjh.mapper.AdminTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【admin_table】的数据库操作Service实现
* @createDate 2022-11-05 13:46:13
*/
@Service
public class AdminTableServiceImpl extends ServiceImpl<AdminTableMapper, AdminTable>
    implements AdminTableService{

    @Autowired
    private AdminTableMapper aMapper;

    @Override
    public AdminTable login(String phone, String password) {
        return aMapper.login(phone, password);
    }

}




