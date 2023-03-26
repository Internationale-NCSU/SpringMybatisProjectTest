package com.example.springmybatisprojecttest.service.impl;

import com.example.springmybatisprojecttest.bean.Songs;
import com.example.springmybatisprojecttest.mapper.SongsInfoMapper;
import com.example.springmybatisprojecttest.service.SongsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongsInfoImpl implements SongsInfoService {
    @Autowired
    SongsInfoMapper songsInfoMapper;
    @Override
    public List<Songs> selectAllSongsInfo(){
        return songsInfoMapper.selectAllSongs();
    }
}
