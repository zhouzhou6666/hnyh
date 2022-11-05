package com.zjh.mapper;

import com.zjh.domain.AdminTable;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjh.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author Administrator
* @description 针对表【admin_table】的数据库操作Mapper
* @createDate 2022-11-05 13:46:13
* @Entity com.zjh.domain.AdminTable
*/
@Mapper
public interface AdminTableMapper extends BaseMapper<AdminTable> {

    @Select("select * from admin_table where phone = #{phone} and password = #{password}")
    AdminTable login(String phone, String password);
}




