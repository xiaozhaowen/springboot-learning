package com.xiaozhao.domain;

import java.io.Serializable;

/**
 * @author xiaozhao
 * @date 2018/10/18下午4:11
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8315794285126194641L;

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
