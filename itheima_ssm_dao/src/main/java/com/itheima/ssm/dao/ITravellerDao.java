package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/3
 * Time:12:41
 */
public interface ITravellerDao {
    @Select("select * from traveller where id in(select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(int ordersId) throws Exception;
}
