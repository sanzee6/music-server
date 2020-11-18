package com.csz.music.service;

import com.csz.music.domain.Song;

import java.util.List;

/**
 * 歌曲service接口
 */
public interface SongService {
    /**
     *增删改查方法
     */

    //增加
    public boolean insert(Song song);

    //修改
    public boolean update(Song song);

    //删除
    public boolean delete(Integer id);

    //查询 ---通过主键查询
    public Song selectByPrimaryKey(Integer id);

    //查询 ---所有歌曲
    public List<Song> allSong();

    //查询 根据歌名模糊查询列表
    public List<Song> songOfName(String name);

    //根据歌手ID查询
    public List<Song> songOfSingerId(Integer singerId);

}
