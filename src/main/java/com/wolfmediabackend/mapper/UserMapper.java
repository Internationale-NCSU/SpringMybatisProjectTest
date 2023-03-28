package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer listenerId);

    int insert(User record);

    User selectByPrimaryKey(Integer listenerId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}