package com.csz.music.dao;

import com.csz.music.domian.Singer;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
歌手Dao
 */
@Repository
public interface SingerMapper {
    /**
     *增删改查方法
     */

    //增加
    public int insert(Singer singer);

    //修改
    public int update(Singer singer);

    //删除
    public int delete(Integer id);

    //查询 ---通过主键查询
    public Singer selectByPrimaryKey(Integer id);

    //查询 ---所有歌手
    public List<Singer> allSinger();

    //查询 根据歌手模糊查询列表
    public List<Singer> singerOfName(String name);

    //根据性别查询
    public List<Singer> singerOfSex(Integer sex);
}
