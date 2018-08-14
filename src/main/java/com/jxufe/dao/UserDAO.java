package com.jxufe.dao;

import com.jxufe.entity.User;
import com.jxufe.entity.UserExample;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer, UserExample> {
}