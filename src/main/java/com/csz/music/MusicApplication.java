package com.csz.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
热更新，热加载
1.需要用双击shift -- 搜索registry，找到Registry... 然后找到C开头app.running
2.怎么才能热更新？ 改完代码之后，ctrl+F9 就能自动编译出
 */
@SpringBootApplication
@MapperScan("com.csz.music.dao")
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
