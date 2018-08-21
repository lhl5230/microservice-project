package com.lhl.restonspringwebmvc.controller;

import com.lhl.restonspringwebmvc.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongliang.liu on 2018/8/22.
 */
@RestController
public class PersonRestController {
    @GetMapping("/person/{id}")
    public Person get(@PathVariable Long id, @RequestParam(required = false) String name) {
        return new Person(id, name);
    }
}
