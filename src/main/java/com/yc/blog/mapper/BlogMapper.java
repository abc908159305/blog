package com.yc.blog.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yc.blog.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YC
 * @since 2021-02-18
 */
public interface BlogMapper extends BaseMapper<Blog> {
    IPage<Blog> selectPageVo(Page<?> page);
}
