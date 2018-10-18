package com.xiaozhao.service;

import com.xiaozhao.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaozhao
 * @date 2018/10/12上午10:59
 */
@Service
public class RedisTestService {
//    @Autowired
//    StringRedisTemplate stringRedisTemplate;
//    @Autowired
//    RedisTemplate redisTemplate;
//
//    @Cacheable(value = "user", key = "#id", unless = "#result==null")
//    public String getUser(int id) {
//        System.out.println("i am from userService");
//        System.out.println(stringRedisTemplate.getValueSerializer());
//        System.out.println(redisTemplate.getValueSerializer());
//        return "fee";
//    }


    @Autowired
    private StringRedisTemplate redisTemplate;




    public String getUser(String key) {
        return redisTemplate.opsForValue().get(key) == null ? "null" : redisTemplate.opsForValue().get(key);
    }

    public void add(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
//        redisTemplate.expire(key, 15, TimeUnit.SECONDS);
    }

    public void add(String key, String value, Long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
    }

    public void update(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }


    @Autowired
    private RedisTemplate<String, Object> template;

    public void addUser() {
        User user = new User();
        user.setId(1);
        user.setName("詹姆斯");
        template.opsForValue().set("u", user);
        System.out.println("添加成功");
    }

    public String getObjName() {
        User u2 = (User) template.opsForValue().get("u");
        return u2.getName();
    }


}
