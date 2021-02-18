package com.yc.blog.mapper;

import com.yc.blog.BlogApplication;
//import com.yc.blog.pojo.User;
import com.yc.blog.entity.User;
import com.yc.blog.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogApplication.class)
public class UserMapperTest {
    @Resource
    IUserService iUserService;
    @Test
    public void select(){
        List<User> users = iUserService.list(null);
        if (null == users){
            System.out.println("为空");
        }else {
            for (User user : users) {
                System.out.println(user.toString());
            }
        }
    }
}
