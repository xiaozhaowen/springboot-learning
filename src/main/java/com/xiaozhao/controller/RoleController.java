package com.xiaozhao.controller;

import com.xiaozhao.domain.Role;
import com.xiaozhao.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色控制器
 *
 * @author xiaozhao
 * @date 2018/9/29上午10:56
 */
@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    public List<Role> queryAll() {
        return this.roleService.queryAll();
    }

    @RequestMapping("/one")
    public Role selectOne() {
        Integer id = 1;
        return this.roleService.selectOne(id);
    }

    @RequestMapping("/add")
    public int add() {
        Role role = new Role();
        role.setName("haha");
        return this.roleService.add(role);
    }

    @RequestMapping("/update")
    public int update() {
        Role role = new Role();
        role.setId(3);
        role.setName("haha");
        return this.roleService.update(role);
    }

    @RequestMapping("/delete")
    public int delete() {
        Integer id = 3;
        return this.roleService.delete(id);
    }
}
