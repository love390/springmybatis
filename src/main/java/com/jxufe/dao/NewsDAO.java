package com.jxufe.dao;

import com.jxufe.entity.News;
import com.jxufe.entity.NewsExample;
import org.springframework.stereotype.Repository;

/**
 * NewsDAO继承基类
 */
@Repository
public interface NewsDAO extends MyBatisBaseDao<News, Integer, NewsExample> {
}