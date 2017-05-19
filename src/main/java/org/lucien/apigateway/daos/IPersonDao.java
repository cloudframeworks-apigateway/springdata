package org.lucien.apigateway.daos;

import org.lucien.apigateway.models.NewInfo;
import org.lucien.apigateway.models.Person;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
public interface IPersonDao {

    int insertPerson(Person person);

    int updatePerson(Person person);

    Person selectPersonById(int pid);

    List<Person> selectPersonList(String key);

    List<Person> selectAllPerson();
}
