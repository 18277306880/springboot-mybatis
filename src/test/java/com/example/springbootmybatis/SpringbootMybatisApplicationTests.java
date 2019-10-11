package com.example.springbootmybatis;

import com.example.springbootmybatis.mapper.GroupMapper;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.model.Group;
import com.example.springbootmybatis.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.getUser(1);
        System.out.println(user.getName());
        List<User> users = userMapper.getUsers(1);
        System.out.println(users.size());

    }

    @Test
    public void contextLoads2() {
        Group group = groupMapper.getGroup(1);
        System.out.println(group.getGroupName());
    }

}
