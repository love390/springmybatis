package com.jxufe.dao;

import com.jxufe.entity.AdminUser;
import com.jxufe.entity.AdminUserExample;
import org.springframework.stereotype.Repository;

/**
 * AdminUserDAO继承基类
 */
@Repository
public interface AdminUserDAO extends MyBatisBaseDao<AdminUser, Integer, AdminUserExample> {
}