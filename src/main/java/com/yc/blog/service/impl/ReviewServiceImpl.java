package com.yc.blog.service.impl;

import com.yc.blog.entity.Review;
import com.yc.blog.mapper.ReviewMapper;
import com.yc.blog.service.IReviewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YC
 * @since 2021-02-18
 */
@Service
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review> implements IReviewService {

}
