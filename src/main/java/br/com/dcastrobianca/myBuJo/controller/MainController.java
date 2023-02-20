package br.com.dcastrobianca.myBuJo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String helloWorld(){
        return "Hello User, how nice seeing you here!";
    }
    
}
