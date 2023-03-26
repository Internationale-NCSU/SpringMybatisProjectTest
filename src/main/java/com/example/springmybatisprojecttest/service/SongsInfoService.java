package com.example.springmybatisprojecttest.service;

import com.example.springmybatisprojecttest.bean.Songs;

import java.util.List;

public interface SongsInfoService {
    List<Songs> selectAllSongsInfo();
}
