package com.csz.music.service;

import com.csz.music.domian.Singer;

import java.util.List;

/**
 * 歌手service接口
 */
public interface SingerService {
    //增加
    public boolean insert(Singer singer);

    //修改
    public boolean update(Singer singer);

    //删除
    public boolean delete(Integer id);

    //查询 ---通过主键查询
    public Singer selectByPrimaryKey(Integer id);

    //查询 ---所有歌手
    public List<Singer> allSinger();

    //查询 根据歌手模糊查询列表
    public List<Singer> singerOfName(String name);

    //根据性别查询
    public List<Singer> singerOfSex(Integer sex);
}
