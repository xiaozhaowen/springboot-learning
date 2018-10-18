package com.xiaozhao.controller;

import com.xiaozhao.service.RedisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaozhao
 * @date 2018/10/12上午11:00
 */
@RestController
@RequestMapping("/redis")
public class RedisTestController {
    @Autowired
    RedisTestService redisTestService;

    @GetMapping("/get")
    public String getUser() {
        return redisTestService.getUser("AAA");
    }

    @GetMapping("/get_o")
    public String getUserObj() {
        return redisTestService.getObjName();
    }

    @GetMapping("/add")
    public String addUser() {
        redisTestService.add("AAA", "Kobe");
        return "ok";
    }

    @GetMapping("/add_u")
    public String addUserObj() {
        redisTestService.addUser();
        return "ok";
    }

    @GetMapping("/add_time")
    public String addWithExpire() {
        redisTestService.add("BBB", "Wade");
        return "ok";
    }

    @GetMapping("/update")
    public String update() {
        redisTestService.update("AAA", "James");
        return "ok";
    }

    @GetMapping("/del")
    public String del() {
        redisTestService.delete("AAA");
        return "ok";
    }


}
