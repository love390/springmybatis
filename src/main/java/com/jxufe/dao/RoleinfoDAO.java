package com.jxufe.dao;

import com.jxufe.entity.Roleinfo;
import com.jxufe.entity.RoleinfoExample;
import org.springframework.stereotype.Repository;

/**
 * RoleinfoDAO继承基类
 */
@Repository
public interface RoleinfoDAO extends MyBatisBaseDao<Roleinfo, Integer, RoleinfoExample> {
}