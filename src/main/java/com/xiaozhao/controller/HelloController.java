package com.xiaozhao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 控制器
 *
 * @author xiaozhao
 * @date 2018/9/29上午9:31
 */
@RestController
public class HelloController {

    @RequestMapping()
    public String hello() {
        return "Hello SpringBoot";
    }
}
