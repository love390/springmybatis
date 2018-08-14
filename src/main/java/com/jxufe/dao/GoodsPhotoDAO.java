package com.jxufe.dao;

import com.jxufe.entity.GoodsPhoto;
import com.jxufe.entity.GoodsPhotoExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsPhotoDAO继承基类
 */
@Repository
public interface GoodsPhotoDAO extends MyBatisBaseDao<GoodsPhoto, Integer, GoodsPhotoExample> {
}