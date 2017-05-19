package org.lucien.apigateway.services;

import org.lucien.apigateway.models.Person;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
public interface IPersonService {
    int insertPerson(Person person);

    int updatePerson(Person person);

    Person selectPersonById(int pid);

    List<Person> selectPersonList(String key);

    List<Person> selectAllPerson();
}
