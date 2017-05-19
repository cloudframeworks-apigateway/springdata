package org.lucien.apigateway.daos.impl;

import org.lucien.apigateway.daos.IPersonDao;
import org.lucien.apigateway.mapper.PersonMapper;
import org.lucien.apigateway.models.NewInfo;
import org.lucien.apigateway.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
@Repository
public class PersonDao implements IPersonDao {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public int insertPerson(Person person) {
        return personMapper.insertPerson(person);
    }

    @Override
    public int updatePerson(Person person) {
        return personMapper.updatePerson(person);
    }

    @Override
    public Person selectPersonById(int pid) {
        return personMapper.selectPersonById(pid);
    }

    @Override
    public List<Person> selectPersonList(String key) {
        return personMapper.selectPersonList(key);
    }

    @Override
    public List<Person> selectAllPerson() {
        return personMapper.selectAllPerson();
    }
}
