package com.yc.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yc.blog.entity.Blog;
import com.yc.blog.service.IBlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ForeController {
    @Resource
    IBlogService iBlogService;

    @GetMapping("/blogs")
    public IPage<Blog> list(@RequestParam(value = "start",defaultValue = "0")int start,@RequestParam(value = "size",defaultValue = "4")int size){
        start = start < 0 ? 0 : start;
        Page<Blog> page = new Page<>(start,size);
        IPage<Blog> blogIPage = iBlogService.selectBlogPage(page);
//        blogIPage.setTotal((long) Math.ceil(blogIPage.getTotal() / blogIPage.getSize()));
        return blogIPage;
    }
    @GetMapping("/blogs/{id}")
    public Blog get(@PathVariable("id") int id){
        Blog blog = iBlogService.getById(id);
        return blog;
    }
}
