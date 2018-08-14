package com.jxufe.dao;

import com.jxufe.entity.Order;
import com.jxufe.entity.OrderExample;
import org.springframework.stereotype.Repository;

/**
 * OrderDAO继承基类
 */
@Repository
public interface OrderDAO extends MyBatisBaseDao<Order, String, OrderExample> {
}