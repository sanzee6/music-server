package com.csz.music.dao;

import com.csz.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
歌区Dao
 */
@Repository
public interface SongMapper {
    /**
     *增删改查方法
     */

    //增加
    public int insert(Song song);

    //修改
    public int update(Song song);

    //删除
    public int delete(Integer id);

    //查询 ---通过主键查询
    public Song selectByPrimaryKey(Integer id);

    //查询 ---所有歌曲
    public List<Song> allSong();

    //查询 根据歌名精确查询列表
    public List<Song> songOfName(String name);

    //根据歌手ID查询
    public List<Song> songOfSingerId(Integer singerId);
}
