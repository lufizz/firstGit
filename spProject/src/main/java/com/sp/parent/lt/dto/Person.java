package com.sp.parent.lt.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private String age;
    private String sex;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
