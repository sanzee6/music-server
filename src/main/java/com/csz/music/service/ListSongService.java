package com.csz.music.service;

import com.csz.music.domain.ListSong;

import java.util.List;

/**
 * 歌单单曲Service接口
 */
public interface ListSongService {
    /**
     *增删改查方法
     */

    //增加
    public boolean insert(ListSong listSong);

    //修改
    public boolean update(ListSong listSong);

    //删除
    public boolean delete(Integer id);

    //根据歌曲ID和歌单ID删除
    public boolean deleteBySongIdAndSongListId(Integer songId, Integer songListId);

    //查询 ---通过主键查询
    public ListSong selectByPrimaryKey(Integer id);

    //查询 ---所有歌单歌曲
    public List<ListSong> allListSong();



    //根据歌单ID查询所有歌曲
    public List<ListSong> listSongOfSongListId(Integer songListId);
}

