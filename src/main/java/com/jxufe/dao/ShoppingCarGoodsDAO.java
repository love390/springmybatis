package com.jxufe.dao;

import com.jxufe.entity.ShoppingCarGoods;
import com.jxufe.entity.ShoppingCarGoodsExample;
import org.springframework.stereotype.Repository;

/**
 * ShoppingCarGoodsDAO继承基类
 */
@Repository
public interface ShoppingCarGoodsDAO extends MyBatisBaseDao<ShoppingCarGoods, Integer, ShoppingCarGoodsExample> {
}