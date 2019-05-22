package com.tanlei.cn.mapper;

import com.tanlei.cn.pojo.Person;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-22 13:21
 */
public interface PersonMapper {

    /**
     * 添加用户
     */
    void  addPerson(Person person);

    /**
     * 查询所有用户
     */
    List<Person> selectPerson();

    /**
     * 根据ID查找单个用户信息
     */
    Person selectById(Integer id);

    /**
     * 修改用户
     */
    void updatePerson(Person person);

    /**
     * 删除用户
     */
    void delete(Integer id);
}
