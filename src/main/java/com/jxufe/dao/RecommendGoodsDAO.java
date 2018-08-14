package com.jxufe.dao;

import com.jxufe.entity.RecommendGoods;
import com.jxufe.entity.RecommendGoodsExample;
import org.springframework.stereotype.Repository;

/**
 * RecommendGoodsDAO继承基类
 */
@Repository
public interface RecommendGoodsDAO extends MyBatisBaseDao<RecommendGoods, Integer, RecommendGoodsExample> {
}