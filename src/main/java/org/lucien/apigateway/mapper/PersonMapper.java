package org.lucien.apigateway.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.lucien.apigateway.models.*;

import java.util.List;

/**
 * Created by lucien on 2017/5/16.
 */
@Mapper
public interface PersonMapper {

    int insertPerson(Person person);

    int updatePerson(Person person);

    @Select("select pid, name, age from tl_person where pid=#{pid}")
    Person selectPersonById(int pid);

    List<Person> selectPersonList(String key);

    @Select("select pid, name, age from tl_person")
    List<Person> selectAllPerson();
}
