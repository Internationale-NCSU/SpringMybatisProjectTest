package com.wolfmediabackend.mapper;

import com.wolfmediabackend.bean.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SongMapper {
    int deleteByPrimaryKey(Integer songId);

    int insert(Song record);

    Song selectByPrimaryKey(Integer songId);

    List<Song> selectAll();

    int updateByPrimaryKey(Song record);

    int updatePlayCountForSongs();

    List<Song> findSongByArtist(Integer id);
}