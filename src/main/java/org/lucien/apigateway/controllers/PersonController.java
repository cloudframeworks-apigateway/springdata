package org.lucien.apigateway.controllers;

import org.lucien.apigateway.models.Person;
import org.lucien.apigateway.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by lucien on 2017/5/17.
 */
@RestController
@RequestMapping("api")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping("/persons")
    public List<Person> personList() {
        return personService.selectAllPerson();
    }
}
