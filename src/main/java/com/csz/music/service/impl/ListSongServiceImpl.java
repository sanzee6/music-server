package com.csz.music.service.impl;

import com.csz.music.dao.ListSongMapper;
import com.csz.music.domain.ListSong;
import com.csz.music.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 歌单单曲Service实现类
 *
 */
@Service
public class ListSongServiceImpl implements ListSongService {
    @Autowired
    private ListSongMapper listSongMapper;
    /**
     * 增删改查方法
     *
     * @param listSong
     */
    @Override
    public boolean insert(ListSong listSong) {
        return listSongMapper.insert(listSong)>0;
    }

    @Override
    public boolean update(ListSong listSong) {
        return listSongMapper.update(listSong)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return listSongMapper.delete(id)>0;
    }

    //根据歌曲ID和歌单ID删除
    @Override
    public boolean deleteBySongIdAndSongListId(Integer songId, Integer songListId){
        return listSongMapper.deleteBySongIdAndSongListId(songId,songListId)>0;
    }


    @Override
    public ListSong selectByPrimaryKey(Integer id) {
        return listSongMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ListSong> allListSong() {
        return listSongMapper.allListSong();
    }


    @Override
    public List<ListSong> listSongOfSongListId(Integer songListId) {
        return listSongMapper.listSongOfSongListId(songListId);
    }
}
