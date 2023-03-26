package com.example.springmybatisprojecttest.mapper;

import com.example.springmybatisprojecttest.bean.Songs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SongsInfoMapper {
    @Select("select * from Songs")
    public List<Songs> selectAllSongs();
}
