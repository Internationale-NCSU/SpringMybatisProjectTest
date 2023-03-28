package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.PodcastEpisode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PodcastEpisodeMapper {
    int deleteByPrimaryKey(Integer podcastEpisodeId);

    int insert(PodcastEpisode record);

    PodcastEpisode selectByPrimaryKey(Integer podcastEpisodeId);

    List<PodcastEpisode> selectAll();

    int updateByPrimaryKey(PodcastEpisode record);
}