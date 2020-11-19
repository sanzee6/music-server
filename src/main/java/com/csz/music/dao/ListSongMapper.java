package com.csz.music.dao;

import com.csz.music.domain.ListSong;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
歌曲歌单歌曲Dao
 */
@Repository
public interface ListSongMapper {
    /**
     *增删改查方法
     */

    //增加
    public int insert(ListSong listSong);

    //修改
    public int update(ListSong listSong);

    //删除
    public int delete(Integer id);

    //根据歌曲ID和歌单ID删除
    public int deleteBySongIdAndSongListId(Integer songId, Integer songListId);

    //查询 ---通过主键查询
    public ListSong selectByPrimaryKey(Integer id);

    //查询 ---所有歌单歌曲
    public List<ListSong> allListSong();

    //根据歌单ID查询所有歌曲
    public List<ListSong> listSongOfSongListId(Integer songListId);
}
