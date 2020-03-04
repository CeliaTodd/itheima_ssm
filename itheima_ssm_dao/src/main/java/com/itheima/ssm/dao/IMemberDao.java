package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/3
 * Time:12:36
 */
public interface IMemberDao {
    @Select("select * from member where id =#{id}")
    public Member findById(int id) throws Exception;
}
