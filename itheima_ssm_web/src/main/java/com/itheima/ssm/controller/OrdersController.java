package com.itheima.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/2
 * Time:17:36
 */
@Controller
@RequestMapping("orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    //未分页代码
/*    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mav = new ModelAndView();
        List<Orders> ordersList = ordersService.findAll();
        mav.addObject("ordersList", ordersList);
        mav.setViewName("orders-list");
        return mav;
    }*/

    @RequestMapping("findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")int page,
                                @RequestParam(name = "size",required = true,defaultValue = "3")int size) throws Exception{
        ModelAndView mav = new ModelAndView();
        List<Orders> OrdersLists = ordersService.findAll(page, size);
        //pageInfo就是一个分页bean
        PageInfo pageInfo = new PageInfo(OrdersLists);
        mav.addObject("pageInfo", pageInfo);
        mav.setViewName("orders-page-list");
        return mav;
    }

    @RequestMapping("findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true)int ordersId) throws Exception {
        ModelAndView mav = new ModelAndView();
        Orders orders = ordersService.findById(ordersId);
        mav.addObject("orders", orders);
        mav.setViewName("orders-show");
        return mav;
    }
}
