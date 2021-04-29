package com.anleeos.androidservice.service;

import java.util.Map;
import java.util.Random;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AndroidController {
    @RequestMapping("/person")
    public Person getPerson(@PathParam("name") String name)
    {
        Person person = new Person();
        Random random = new Random();
        person.setName(name);
        person.setAge(random.nextInt(100));
        person.setGender("male");
        return person;
    }
}
