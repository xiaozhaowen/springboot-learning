package com.xiaozhao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 这个注解是给指定包下的类自动添加@Mapper，省的com.xiaozhao.dao下的每个mapper类都得添加一个@Mapper注解了
 */
@MapperScan("com.xiaozhao.dao")
public class SpringbootLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearningApplication.class, args);
    }
}
