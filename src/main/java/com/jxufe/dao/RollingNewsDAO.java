package com.jxufe.dao;

import com.jxufe.entity.RollingNews;
import com.jxufe.entity.RollingNewsExample;
import org.springframework.stereotype.Repository;

/**
 * RollingNewsDAO继承基类
 */
@Repository
public interface RollingNewsDAO extends MyBatisBaseDao<RollingNews, Integer, RollingNewsExample> {
}