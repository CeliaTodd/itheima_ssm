package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/4
 * Time:15:43
 */
public interface IPermissionService {
    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
