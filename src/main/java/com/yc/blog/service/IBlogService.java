package com.yc.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yc.blog.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YC
 * @since 2021-02-18
 */
public interface IBlogService extends IService<Blog> {
        public IPage<Blog> selectBlogPage(Page<Blog> page);
}
