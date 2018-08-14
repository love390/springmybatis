package com.jxufe.dao;

import com.jxufe.entity.Image;
import com.jxufe.entity.ImageExample;
import org.springframework.stereotype.Repository;

/**
 * ImageDAO继承基类
 */
@Repository
public interface ImageDAO extends MyBatisBaseDao<Image, Image, ImageExample> {
}