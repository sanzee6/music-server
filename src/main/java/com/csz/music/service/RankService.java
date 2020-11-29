package com.csz.music.service;

import com.csz.music.domain.Rank;

/*
评价service接口
 */
public interface RankService {
    /**
     *增加
     */
    public boolean insert(Rank rank);

    /**
     * 查总分
     */
    public int selectScoreSum(Integer songListId);

    /**
     * 查总评分人数
     */
    public int selectRankNum(Integer songListId);

    /***
     * 根据歌单歌曲计算平均分
     */
    public int rankOfSongListId(Integer songListId);
}
