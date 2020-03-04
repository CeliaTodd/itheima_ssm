package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import com.itheima.ssm.service.IUserService;
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
 * Time:12:23
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mav = new ModelAndView();
        List<UserInfo> userList = userService.findAll();
        mav.addObject("userList", userList);
        mav.setViewName("user-list");
        return mav;
    }

    //用户添加
    @RequestMapping("save.do")
    public String save(UserInfo userInfo) throws Exception {
        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    @RequestMapping("findById.do")
    public ModelAndView findById(int id) throws Exception {
        ModelAndView mav = new ModelAndView();
        UserInfo userInfo = userService.findById(id);
        mav.addObject("user", userInfo);
        mav.setViewName("user-show1");
        return mav;
    }

    @RequestMapping("findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id",required = true) int userId) throws Exception {
        ModelAndView mav = new ModelAndView();
        UserInfo userInfo = userService.findById(userId);
        List<Role> otherRoles = userService.findOtherRoles(userId);
        mav.addObject("user", userInfo);
        mav.addObject("roleList", otherRoles);
        mav.setViewName("user-role-add");
        return mav;
    }

    @RequestMapping("addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userId", required = true) int userId, @RequestParam(name = "ids",required = true) String[] roleIds) throws Exception {
        userService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";
    }
}
