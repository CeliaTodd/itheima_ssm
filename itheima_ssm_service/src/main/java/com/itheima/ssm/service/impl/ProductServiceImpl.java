package com.itheima.ssm.service.impl;

import com.itheima.ssm.service.IProductService;
import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/1
 * Time:21:36
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }
}
