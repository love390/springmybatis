package com.jxufe.dao;

import com.jxufe.entity.RollingFruit;
import com.jxufe.entity.RollingFruitExample;
import org.springframework.stereotype.Repository;

/**
 * RollingFruitDAO继承基类
 */
@Repository
public interface RollingFruitDAO extends MyBatisBaseDao<RollingFruit, Integer, RollingFruitExample> {
}