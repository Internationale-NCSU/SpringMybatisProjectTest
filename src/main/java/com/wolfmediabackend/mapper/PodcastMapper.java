package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.Podcast;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PodcastMapper {
    int deleteByPrimaryKey(Integer podcastId);

    int insert(Podcast record);

    Podcast selectByPrimaryKey(Integer podcastId);

    List<Podcast> selectAll();

    int updateByPrimaryKey(Podcast record);
}