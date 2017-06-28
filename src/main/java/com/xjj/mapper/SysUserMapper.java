package com.xjj.mapper;

import com.xjj.domain.SysRole;
import com.xjj.domain.SysUser;

import java.util.List;

/**
 * SpringBootDemo
 * Created by xian.juanjuan on 2017-6-28 09:06.
 */
public interface SysUserMapper extends BaseMapper {
    SysUser findByUsername(String username);

    List<SysRole> findRolesByUsername(String username);
}
