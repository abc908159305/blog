package com.yc.blog.service.impl;

import com.yc.blog.entity.Category;
import com.yc.blog.mapper.CategoryMapper;
import com.yc.blog.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
