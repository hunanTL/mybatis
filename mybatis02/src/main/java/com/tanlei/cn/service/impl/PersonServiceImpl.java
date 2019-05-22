package com.tanlei.cn.service.impl;

import com.tanlei.cn.mapper.PersonMapper;
import com.tanlei.cn.pojo.Person;
import com.tanlei.cn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-22 13:28
 */
@Service
@Transactional
public class PersonServiceImpl  implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public void addPerson(Person person) {
        this.personMapper.addPerson(person);
    }

    @Override
    public List<Person> selectPerson() {
        return this.personMapper.selectPerson();
    }

    @Override
    public Person selectById(Integer id) {
        return this.personMapper.selectById(id);
    }

    @Override
    public void updatePerson(Person person) {
         this.personMapper.updatePerson(person);
    }

    @Override
    public void delete(Integer id) {
        this.personMapper.delete(id);
    }
}
