package com.xiaozhao.dao;

import com.xiaozhao.domain.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author xiaozhao
 * @date 2018/9/29上午10:40
 * <p>
 * 使用注解的形式
 */

/**
 * @Mapper 如果没有在SpringbootLearingApplication添加@MapperScan 注解的话，这里都需要一个这样的注解
 */
public interface RoleMapper {
    /**
     * 查询所有的角色
     *
     * @return
     */
    @Select("SELECT id, name FROM role")
    @Results({
            @Result(property = "id", column = "id", jdbcType = JdbcType.INTEGER),
            @Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR)
    })
    List<Role> queryAll();


    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    @Select("SELECT id, name FROM role  WHERE id=#{id}")
    @Results({
            @Result(property = "id", column = "id", jdbcType = JdbcType.INTEGER),
            @Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR)
    })
    Role selectOne(Integer id);

    /**
     * 新增
     *
     * @param role
     * @return
     */
    @Insert(" INSERT INTO role(name) VALUES (#{name})")
    int add(Role role);

    /**
     * 修改
     *
     * @param role
     * @return
     */
    @Update(" UPDATE role set name=#{name} WHERE id=#{id}")
    int update(Role role);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Delete("  DELETE  FROM role WHERE id=#{id}")
    int delete(Integer id);
}