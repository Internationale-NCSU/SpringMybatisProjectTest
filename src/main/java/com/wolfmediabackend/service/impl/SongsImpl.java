package com.wolfmediabackend.service.impl;

import com.wolfmediabackend.bean.Album;
import com.wolfmediabackend.bean.Artist;
import com.wolfmediabackend.bean.Song;
import com.wolfmediabackend.mapper.SongMapper;
import com.wolfmediabackend.service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongsImpl implements SongsService {
    @Autowired
    private SongMapper songMapper;

    @Override
    public List<Song> selectAllSongs() {
        return songMapper.selectAll();
    }

    @Override
    public void enterSong(Song song) {
        songMapper.insert(song);
    }

    @Override
    public void updateSong(Song song) {
        songMapper.updateByPrimaryKey(song);
    }

    @Override
    public void deleteSong(Integer id) {
        songMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void enterPlayCountForSongs() {

    }

    @Override
    public void updatePlayCountForSongs() {
        songMapper.updatePlayCountForSongs();
    }

    @Override
    public List<Song> findSongByArtist(Artist artist) {
        return songMapper.findSongByArtist(artist.getArtistId());
    }

    @Override
    public List<Song> findSongByAlbum(Album album) {
        return null;
    }
}
