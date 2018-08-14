package com.jxufe.dao;

import com.jxufe.entity.GoodsCategory;
import com.jxufe.entity.GoodsCategoryExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsCategoryDAO继承基类
 */
@Repository
public interface GoodsCategoryDAO extends MyBatisBaseDao<GoodsCategory, Integer, GoodsCategoryExample> {
}