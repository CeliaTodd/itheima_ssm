package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/1
 * Time:22:18
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService productService;

    //产品添加
    @RequestMapping("save.do")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }


    //查询全部产品
    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mav = new ModelAndView();
        List<Product> ps = productService.findAll();
        mav.addObject("productList", ps);
        mav.setViewName("product-list1");
        return mav;
    }
}
