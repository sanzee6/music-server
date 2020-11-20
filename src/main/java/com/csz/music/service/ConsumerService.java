package com.csz.music.service;

import com.csz.music.domain.Consumer;

import java.util.List;

/**
 * 前端用户Service接口
 */
public interface ConsumerService {
    /**
     *增删改查方法
     */

    //增加
    public boolean insert(Consumer consumer);

    //修改
    public boolean update(Consumer consumer);

    //删除
    public boolean delete(Integer id);

    //查询 ---通过主键查询
    public Consumer selectByPrimaryKey(Integer id);

    //查询 ---所有用户
    public List<Consumer> allConsumer();

    // 验证密码
    public boolean verifyPassword(String username, String password);

    //查询 ---根据账号查询
    public Consumer getByUsername(String username);

}
