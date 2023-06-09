package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.paidLabel;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface paidLabelMapper {
    int deleteByPrimaryKey(@Param("paidStreamingAccountId") Integer paidStreamingAccountId, @Param("id") Integer id, @Param("paidRecordLabelId") Integer paidRecordLabelId);

    int insert(paidLabel record);

    paidLabel selectByPrimaryKey(@Param("paidStreamingAccountId") Integer paidStreamingAccountId, @Param("id") Integer id, @Param("paidRecordLabelId") Integer paidRecordLabelId);

    List<paidLabel> selectAll();

    int updateByPrimaryKey(paidLabel record);
}