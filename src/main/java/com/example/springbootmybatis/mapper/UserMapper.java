package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
     void save(User user);
     User getUser(int id);
     List<User> getUsers(int groupId);
}
