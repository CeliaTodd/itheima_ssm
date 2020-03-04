package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/4
 * Time:16:55
 */
public interface IRoleService {
    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(int roleId) throws Exception;

    List<Permission> findOtherPermissions(int roleId) throws Exception;

    void addPermissionToRole(int roleId, String[] permissionIds) throws Exception;
}
