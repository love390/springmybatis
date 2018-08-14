package com.jxufe.dao;

import com.jxufe.entity.Feedback;
import com.jxufe.entity.FeedbackExample;
import org.springframework.stereotype.Repository;

/**
 * FeedbackDAO继承基类
 */
@Repository
public interface FeedbackDAO extends MyBatisBaseDao<Feedback, Integer, FeedbackExample> {
}