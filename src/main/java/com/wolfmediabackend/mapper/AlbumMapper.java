package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.Album;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AlbumMapper {
    int deleteByPrimaryKey(Integer albumId);

    int insert(Album record);

    Album selectByPrimaryKey(Integer albumId);

    List<Album> selectAll();

    int updateByPrimaryKey(Album record);
}