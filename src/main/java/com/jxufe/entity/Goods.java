package com.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * goods
 * @author 
 */
public class Goods implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品库存量
     */
    private Integer goodsCount;

    /**
     * 商品封面图片
     */
    private String goodsCover;

    /**
     * 商品价格
     */
    private Float goodsPrice;

    /**
     * 市场价格
     */
    private Float goodsMarketPrice;

    /**
     * 创建时间
     */
    private Date goodsCreateTime;

    /**
     * 0:下架 1:上架
     */
    private Integer goodsStatus;

    /**
     * 商品描述
     */
    private String goodsDesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getGoodsCover() {
        return goodsCover;
    }

    public void setGoodsCover(String goodsCover) {
        this.goodsCover = goodsCover;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Float getGoodsMarketPrice() {
        return goodsMarketPrice;
    }

    public void setGoodsMarketPrice(Float goodsMarketPrice) {
        this.goodsMarketPrice = goodsMarketPrice;
    }

    public Date getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(Date goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsCount() == null ? other.getGoodsCount() == null : this.getGoodsCount().equals(other.getGoodsCount()))
            && (this.getGoodsCover() == null ? other.getGoodsCover() == null : this.getGoodsCover().equals(other.getGoodsCover()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsMarketPrice() == null ? other.getGoodsMarketPrice() == null : this.getGoodsMarketPrice().equals(other.getGoodsMarketPrice()))
            && (this.getGoodsCreateTime() == null ? other.getGoodsCreateTime() == null : this.getGoodsCreateTime().equals(other.getGoodsCreateTime()))
            && (this.getGoodsStatus() == null ? other.getGoodsStatus() == null : this.getGoodsStatus().equals(other.getGoodsStatus()))
            && (this.getGoodsDesc() == null ? other.getGoodsDesc() == null : this.getGoodsDesc().equals(other.getGoodsDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsCount() == null) ? 0 : getGoodsCount().hashCode());
        result = prime * result + ((getGoodsCover() == null) ? 0 : getGoodsCover().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsMarketPrice() == null) ? 0 : getGoodsMarketPrice().hashCode());
        result = prime * result + ((getGoodsCreateTime() == null) ? 0 : getGoodsCreateTime().hashCode());
        result = prime * result + ((getGoodsStatus() == null) ? 0 : getGoodsStatus().hashCode());
        result = prime * result + ((getGoodsDesc() == null) ? 0 : getGoodsDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", goodsCover=").append(goodsCover);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsMarketPrice=").append(goodsMarketPrice);
        sb.append(", goodsCreateTime=").append(goodsCreateTime);
        sb.append(", goodsStatus=").append(goodsStatus);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}