package com.jxufe.dao;

import com.jxufe.entity.ShoppingCar;
import com.jxufe.entity.ShoppingCarExample;
import org.springframework.stereotype.Repository;

/**
 * ShoppingCarDAO继承基类
 */
@Repository
public interface ShoppingCarDAO extends MyBatisBaseDao<ShoppingCar, Integer, ShoppingCarExample> {
}