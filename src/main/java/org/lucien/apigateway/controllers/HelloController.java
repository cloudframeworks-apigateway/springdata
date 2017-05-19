package org.lucien.apigateway.controllers;

import org.lucien.apigateway.models.NewInfo;
import org.lucien.apigateway.models.Person;
import org.lucien.apigateway.services.INewInfoService;
import org.lucien.apigateway.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by lucien on 2017/5/16.
 */
@Controller
public class HelloController {

    @Autowired
    private IPersonService personService;

    @Autowired
    private INewInfoService newInfoService;

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name", "[Angel -- 守护天使]");
        return "hello";
    }

    @RequestMapping("/persons")
    public String personList(Map<String,Object> context) {
        List<Person> personList = personService.selectAllPerson();
        context.put("personList", personList);
        return "personlist";
    }

    @RequestMapping("/newinfos")
    public String newInfoList(Map<String,Object> context) {
        List<NewInfo> newInfoList = newInfoService.selectAllNewInfo();
        context.put("newInfoList", newInfoList);
        return "newinfolist";
    }
}
