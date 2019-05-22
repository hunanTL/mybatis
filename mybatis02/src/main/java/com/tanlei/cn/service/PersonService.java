package com.tanlei.cn.service;

import com.tanlei.cn.pojo.Person;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-22 11:20
 */
public interface PersonService {

    void  addPerson(Person person);

    List<Person> selectPerson();

    Person selectById(Integer id);

    void updatePerson(Person person);

    void delete(Integer id);
}
