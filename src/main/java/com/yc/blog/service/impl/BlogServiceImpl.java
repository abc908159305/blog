package com.yc.blog.service.impl;

import com.yc.blog.entity.Blog;
import com.yc.blog.mapper.BlogMapper;
import com.yc.blog.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
