package com.csz.music.service.impl;

import com.csz.music.dao.RankMapper;
import com.csz.music.domain.Rank;
import com.csz.music.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 实现评价service
 *
 */
@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private RankMapper rankMapper;
    /**
     * 增加
     *
     * @param rank
     */
    @Override
    public boolean insert(Rank rank) {
        return rankMapper.insert(rank)>0;
    }

    /**
     * 查总分
     *
     * @param songListId
     */
    @Override
    public int selectScoreSum(Integer songListId) {
        return rankMapper.selectScoreSum(songListId);
    }

    /**
     * 查总评分人数
     *
     * @param songListId
     */
    @Override
    public int selectRankNum(Integer songListId) {
        return rankMapper.selectRankNum(songListId);
    }

    /***
     * 根据歌单歌曲计算平均分
     * @param songListId
     */
    @Override
    public int rankOfSongListId(Integer songListId) {
        int rankNum = rankMapper.selectRankNum(songListId);
        if (rankNum ==0){
            return 5;
        }
        return rankMapper.selectScoreSum(songListId)/rankNum;
    }
}
