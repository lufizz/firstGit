package com.sp.parent.lt.controller;

import com.alibaba.fastjson.JSONObject;
import com.sp.parent.lt.config.PersonConfig;
import com.sp.parent.lt.dto.Person;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lt")
public class SayHelloController {
    @Autowired
    PersonConfig personConfig;

    @RequestMapping("sayHello")
    public String sayHello(){
        return  "Hello World";
    }

    @RequestMapping("getPerson")
    public Object getPerson(){
        System.out.println(personConfig.toString());
        Person person = new Person();
        BeanUtils.copyProperties(personConfig,person);
        person.setId("");
        String str = JSONObject.toJSONString(person);
        return str;
    }
}
