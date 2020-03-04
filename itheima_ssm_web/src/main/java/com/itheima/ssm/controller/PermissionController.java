package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/4
 * Time:15:41
 */
@Controller
@RequestMapping("permission")
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mav = new ModelAndView();
        List<Permission> permissionList = permissionService.findAll();
        mav.addObject("permissionList", permissionList);
        mav.setViewName("permission-list");
        return mav;
    };

    @RequestMapping("save.do")
    public String save(Permission permission) throws Exception {
        permissionService.save(permission);
        return "redirect:findAll.do";
    }
}
