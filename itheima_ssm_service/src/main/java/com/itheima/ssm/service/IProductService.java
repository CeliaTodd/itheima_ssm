package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/1
 * Time:21:35
 */
public interface IProductService {
    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
