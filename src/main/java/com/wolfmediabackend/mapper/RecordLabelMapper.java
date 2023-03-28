package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.RecordLabel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RecordLabelMapper {
    int deleteByPrimaryKey(Integer recordLabelId);

    int insert(RecordLabel record);

    RecordLabel selectByPrimaryKey(Integer recordLabelId);

    List<RecordLabel> selectAll();

    int updateByPrimaryKey(RecordLabel record);
}