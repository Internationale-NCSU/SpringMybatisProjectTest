package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.released;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface releasedMapper {
    int deleteByPrimaryKey(@Param("artistId") Integer artistId, @Param("albumId") Integer albumId);

    int insert(released record);

    List<released> selectAll();
}