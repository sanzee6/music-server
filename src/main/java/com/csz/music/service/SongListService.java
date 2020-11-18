package com.csz.music.service;

import com.csz.music.domain.SongList;

import java.util.List;

/**
 * 歌单service接口
 */
public interface SongListService {
    /**
     *增删改查方法
     */

    //增加
    public boolean insert(SongList songList);

    //修改
    public boolean update(SongList songList);

    //删除
    public boolean delete(Integer id);

    //查询 ---通过主键查询
    public SongList selectByPrimaryKey(Integer id);

    //查询 ---所有歌单
    public List<SongList> allSongList();

    //查询 根据标题精确查询歌单列表
    public List<SongList> songListOfTitle(String title);

    //查询 根据标题模糊查询歌单列表
    public List<SongList> likeTitle(String title);

    //查询 根据风格模糊查询歌单列表
    public List<SongList> likeStyle(String style);
}
