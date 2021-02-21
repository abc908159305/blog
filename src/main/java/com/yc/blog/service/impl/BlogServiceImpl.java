package com.yc.blog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yc.blog.entity.Blog;
import com.yc.blog.mapper.BlogMapper;
import com.yc.blog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    @Resource
    BlogMapper blogMapper;
    @Override
    public IPage<Blog> selectBlogPage(Page<Blog> page) {
        return blogMapper.selectPageVo(page);
    }
}
