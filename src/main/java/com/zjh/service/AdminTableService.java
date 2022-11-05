package com.zjh.service;

import com.zjh.domain.AdminTable;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.domain.SysUser;

/**
* @author Administrator
* @description 针对表【admin_table】的数据库操作Service
* @createDate 2022-11-05 13:46:13
*/
public interface AdminTableService extends IService<AdminTable> {
    AdminTable login(String phone, String password);

}
