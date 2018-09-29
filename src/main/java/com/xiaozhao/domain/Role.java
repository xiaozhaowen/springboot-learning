package com.xiaozhao.domain;

/**
 * 角色实体类，对应数据库表role
 *
 * @author xiaozhao
 * @date 2018/9/29上午10:31
 */
public class Role {
    /**
     * 主健ID (无默认值)
     */
    private Integer id;

    /**
     * 角色名称(必填项)  (默认值为: )
     */
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
