package com.itheima.ssm.domain;

import com.itheima.ssm.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/2
 * Time:17:10
 */
//订单实体类
public class Orders implements Serializable {
    private int id;
    private String orderNum;
    private Date orderTime;
    private String orderTimeStr;
    private int peopleCount;
    private String orderDesc;
    private int payType;
    private String payTypeStr;
    private int orderStatus;
    private String orderStatusStr;
    private int productId;
    private int memberId;
    private Product product;
    private List<Traveller> travellers;
    private Member member;

    public Orders() {
    }

    public Orders(int id, String orderNum, Date orderTime, String orderTimeStr, int peopleCount, String orderDesc, int payType, String payTypeStr, int orderStatus, String orderStatusStr, int productId, int memberId, Product product, List<Traveller> travellers, Member member) {
        this.id = id;
        this.orderNum = orderNum;
        this.orderTime = orderTime;
        this.orderTimeStr = orderTimeStr;
        this.peopleCount = peopleCount;
        this.orderDesc = orderDesc;
        this.payType = payType;
        this.payTypeStr = payTypeStr;
        this.orderStatus = orderStatus;
        this.orderStatusStr = orderStatusStr;
        this.productId = productId;
        this.memberId = memberId;
        this.product = product;
        this.travellers = travellers;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTimeStr() {
        if (orderTime != null) {
            orderTimeStr= DateUtils.date2String(orderTime, "yyyy-MM-dd HH:mm");
        }
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        //支付方式(0 支付宝 , 1 微信 ,2 其他)
        if (payType == 0) {
            payTypeStr = "支付宝";
        } else if (payType == 1) {
            payTypeStr = "微信";
        } else if (payType==2){
            payTypeStr = "其他";
        }
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusStr() {
        if (orderStatus == 0) {
            orderStatusStr = "未支付";
        } else if (orderStatus == 1) {
            orderStatusStr = "已支付";
        }
        return orderStatusStr;
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", orderTimeStr='" + orderTimeStr + '\'' +
                ", peopleCount=" + peopleCount +
                ", orderDesc='" + orderDesc + '\'' +
                ", payType=" + payType +
                ", payTypeStr='" + payTypeStr + '\'' +
                ", orderStatus=" + orderStatus +
                ", orderStatusStr='" + orderStatusStr + '\'' +
                ", productId=" + productId +
                ", memberId=" + memberId +
                ", product=" + product +
                ", travellers=" + travellers +
                ", member=" + member +
                '}';
    }
}
