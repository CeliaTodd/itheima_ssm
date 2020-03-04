package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/2
 * Time:17:37
 */
public interface IOrdersService {
    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(int ordersId) throws Exception;
}
