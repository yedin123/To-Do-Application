package com.todoAplication.todoAplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String helloWorld(){
        return "To-do Application !";
    }

}
