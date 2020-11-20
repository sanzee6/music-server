package com.csz.music.dao;

import com.csz.music.domain.Consumer;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
前端用户Dao
 */
@Repository
public interface ConsumerMapper {
    /**
     *增删改查方法
     */

    //增加
    public int insert(Consumer consumer);

    //修改
    public int update(Consumer consumer);

    //删除
    public int delete(Integer id);

    //查询 ---通过主键查询
    public Consumer selectByPrimaryKey(Integer id);

    //查询 ---所有用户
    public List<Consumer> allConsumer();

    // 验证密码
    public int verifyPassword(String username, String password);

    //查询 ---根据账号查询
    public Consumer getByUsername(String username);


}
