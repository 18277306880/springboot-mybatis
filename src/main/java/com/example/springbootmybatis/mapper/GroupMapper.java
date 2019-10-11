package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.Group;
import com.example.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupMapper {
     void save(Group group);

     Group getGroup(int id);
}
