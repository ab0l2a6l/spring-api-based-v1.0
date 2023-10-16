package org.abolfazl.controller;

import org.abolfazl.entity.Person;
import org.abolfazl.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/save")
    public Object save(@ModelAttribute Person person) {
        personService.save(person);
        return personService.findOne(person);
    }

    @RequestMapping("update")
    public Object update(@ModelAttribute Person person) {
        personService.update(person);
        return personService.findOne(person);
    }

    @RequestMapping("/remove")
    public Object remove(@ModelAttribute Person person) {
        personService.remove(person);
        return personService.findOne(person);
    }

    @RequestMapping("/findAll")
    public Object findAll() {
        return personService.findAll();
    }

    @RequestMapping("/findOne")
    public Object findOne(@ModelAttribute Person person) {
        return personService.findOne(person);
    }
}
