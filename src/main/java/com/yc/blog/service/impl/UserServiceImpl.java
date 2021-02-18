package com.yc.blog.service.impl;

import com.yc.blog.entity.User;
import com.yc.blog.mapper.UserMapper;
import com.yc.blog.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
