package com.jxufe.dao;

import com.jxufe.entity.UserAddress;
import com.jxufe.entity.UserAddressExample;
import org.springframework.stereotype.Repository;

/**
 * UserAddressDAO继承基类
 */
@Repository
public interface UserAddressDAO extends MyBatisBaseDao<UserAddress, Integer, UserAddressExample> {
}