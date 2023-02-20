package br.com.dcastrobianca.myBuJo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dcastrobianca.myBuJo.collections.CollectionRegistrationData;
import jakarta.validation.Valid;

@RestController

public class CollectionsController {
    
    @RequestMapping ("/mycollections/add")
    public void addCollection(@RequestBody @Valid CollectionRegistrationData collectionData){
        System.out.println(collectionData);
    }
}
