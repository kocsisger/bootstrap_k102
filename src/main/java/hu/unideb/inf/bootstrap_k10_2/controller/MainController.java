package hu.unideb.inf.bootstrap_k10_2.controller;

import hu.unideb.inf.bootstrap_k10_2.model.Person;
import hu.unideb.inf.bootstrap_k10_2.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("")
    public String showHomepage(){
        return "index";
    }

    @GetMapping("/persons")
    public String showPersons(Model model){
        model.addAttribute("personsList", personRepository.findAll());
        return "persons";
    }

    @GetMapping("/persons/new")
    public String newPerson(Model model){
        model.addAttribute("newPerson", new Person());
        return "newPersonForm";
    }
}
