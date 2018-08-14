package com.jxufe.dao;

import com.jxufe.entity.Category;
import com.jxufe.entity.CategoryExample;
import org.springframework.stereotype.Repository;

/**
 * CategoryDAO继承基类
 */
@Repository
public interface CategoryDAO extends MyBatisBaseDao<Category, Integer, CategoryExample> {
}