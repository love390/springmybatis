package com.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * order
 * @author 
 */
public class Order implements Serializable {
    /**
     * 主键id
     */
    private String orderid;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 订单金额
     */
    private Float orderprice;

    /**
     * 0:未支付 1:已支付
     */
    private Integer paystatus;

    /**
     * 创建时间
     */
    private Date ordertime;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Float getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Float orderprice) {
        this.orderprice = orderprice;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getOrderprice() == null ? other.getOrderprice() == null : this.getOrderprice().equals(other.getOrderprice()))
            && (this.getPaystatus() == null ? other.getPaystatus() == null : this.getPaystatus().equals(other.getPaystatus()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getOrderprice() == null) ? 0 : getOrderprice().hashCode());
        result = prime * result + ((getPaystatus() == null) ? 0 : getPaystatus().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", uid=").append(uid);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", orderprice=").append(orderprice);
        sb.append(", paystatus=").append(paystatus);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}