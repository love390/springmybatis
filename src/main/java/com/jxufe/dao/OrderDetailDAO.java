package com.jxufe.dao;

import com.jxufe.entity.OrderDetail;
import com.jxufe.entity.OrderDetailExample;
import org.springframework.stereotype.Repository;

/**
 * OrderDetailDAO继承基类
 */
@Repository
public interface OrderDetailDAO extends MyBatisBaseDao<OrderDetail, Integer, OrderDetailExample> {
}