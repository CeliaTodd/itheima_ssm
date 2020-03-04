package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/4
 * Time:15:45
 */
public interface IPermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{roleId})")
    public List<Permission> findPermissionByRoleId(int id) throws Exception;

    @Select("select * from permission")
    public List<Permission> findAll() throws Exception;

    @Insert(("insert into permission(permissionName,url) values(#{permissionName},#{url})"))
    void save(Permission permission) throws Exception;
}
