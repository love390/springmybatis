package com.jxufe.entity;

import java.io.Serializable;

/**
 * shopping_car_goods
 * @author 
 */
public class ShoppingCarGoods implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 购物车id
     */
    private Integer shoppingCarId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 购买数量
     */
    private Integer goodsCount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(Integer shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
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
        ShoppingCarGoods other = (ShoppingCarGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShoppingCarId() == null ? other.getShoppingCarId() == null : this.getShoppingCarId().equals(other.getShoppingCarId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCount() == null ? other.getGoodsCount() == null : this.getGoodsCount().equals(other.getGoodsCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShoppingCarId() == null) ? 0 : getShoppingCarId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCount() == null) ? 0 : getGoodsCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shoppingCarId=").append(shoppingCarId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}