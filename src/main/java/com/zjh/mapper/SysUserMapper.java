package com.zjh.mapper;


import com.zjh.domain.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author Administrator
* @description 针对表【sys_user(用户信息表)】的数据库操作Mapper
* @createDate 2022-11-01 19:26:46
* @Entity com.zjh.domain.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("select * from sys_user where referee=#{phone}")
    List<SysUser> findAll(String phone);


//    @Select(" select * from sys_user where   hobby like concat('%',#{SysUser.hobby},'%');")
    List<SysUser> likeAll(SysUser sysUser);


}




