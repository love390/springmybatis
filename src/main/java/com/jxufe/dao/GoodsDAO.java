package com.jxufe.dao;

import com.jxufe.entity.Goods;
import com.jxufe.entity.GoodsExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsDAO继承基类
 */
@Repository
public interface GoodsDAO extends MyBatisBaseDao<Goods, Integer, GoodsExample> {
}