package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/4
 * Time:13:40
 */
public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    public static String encodePassword(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    //测试加密效果
    public static void main(String[] args) {
        String password = "456789";
        String pwd = encodePassword(password);
        System.out.println(pwd);
    }
}
