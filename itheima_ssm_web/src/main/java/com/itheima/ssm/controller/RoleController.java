package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;
import com.itheima.ssm.service.IRoleService;
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
 * Date:2020/3/4
 * Time:16:50
 */
@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mav = new ModelAndView();
        List<Role> roleList = roleService.findAll();
        mav.addObject("roleList", roleList);
        mav.setViewName("role-list");
        return mav;
    }

    @RequestMapping("save.do")
    public String save(Role role) throws Exception {
        roleService.save(role);
        return "redirect:findAll.do";
    }

    @RequestMapping("findRoleByIdAndAllPermission.do")
    public ModelAndView findRoleByIdAndAllPermission(@RequestParam(name = "id",required = true) int roleId) throws Exception {
        ModelAndView mav = new ModelAndView();
        Role role = roleService.findById(roleId);
        List<Permission> otherPermissions = roleService.findOtherPermissions(roleId);
        mav.addObject("role", role);
        mav.addObject("permissionList", otherPermissions);
        mav.setViewName("role-permission-add");
        return mav;
    }

    @RequestMapping("addPermissionToRole.do")
    public String addPermissionToRole(@RequestParam(name = "roleId",required = true)int roleId,@RequestParam(name = "ids",required = true)String[] permissionIds) throws Exception {
        roleService.addPermissionToRole(roleId,permissionIds);
        return "redirect:findAll.do";
    }
}
