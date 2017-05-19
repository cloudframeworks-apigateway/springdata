package org.lucien.apigateway.models;

import org.springframework.context.annotation.Bean;

/**
 * Created by lucien on 2017/5/16.
 */
public class Person {

    private Integer pid;
    private String name;
    private Integer age;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
