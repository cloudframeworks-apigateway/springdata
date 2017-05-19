package org.lucien.apigateway.services.impl;

import org.lucien.apigateway.daos.IPersonDao;
import org.lucien.apigateway.models.Person;
import org.lucien.apigateway.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
@Service
public class PersonService implements IPersonService{

    @Autowired
    private IPersonDao personDao;

    @Override
    public int insertPerson(Person person) {
        return personDao.insertPerson(person);
    }

    @Override
    public int updatePerson(Person person) {
        return personDao.updatePerson(person);
    }

    @Override
    public Person selectPersonById(int pid) {
        return personDao.selectPersonById(pid);
    }

    @Override
    public List<Person> selectPersonList(String key) {
        return personDao.selectPersonList(key);
    }

    @Override
    public List<Person> selectAllPerson() {
        return personDao.selectAllPerson();
    }
}
