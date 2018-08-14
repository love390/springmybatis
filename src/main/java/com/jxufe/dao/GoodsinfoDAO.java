package com.jxufe.dao;

import com.jxufe.entity.Goodsinfo;
import com.jxufe.entity.GoodsinfoExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsinfoDAO继承基类
 */
@Repository
public interface GoodsinfoDAO extends MyBatisBaseDao<Goodsinfo, Integer, GoodsinfoExample> {
}