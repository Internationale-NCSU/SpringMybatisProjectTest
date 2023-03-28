package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.theMediaStreamingManagement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface theMediaStreamingManagementMapper {
    int deleteByPrimaryKey(Integer streamingAccountId);

    int insert(theMediaStreamingManagement record);

    theMediaStreamingManagement selectByPrimaryKey(Integer streamingAccountId);

    List<theMediaStreamingManagement> selectAll();

    int updateByPrimaryKey(theMediaStreamingManagement record);
}