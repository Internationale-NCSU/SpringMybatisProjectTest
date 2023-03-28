package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.Artist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ArtistMapper {
    int deleteByPrimaryKey(Integer artistId);

    int insert(Artist record);

    Artist selectByPrimaryKey(Integer artistId);

    List<Artist> selectAll();

    int updateByPrimaryKey(Artist record);
}