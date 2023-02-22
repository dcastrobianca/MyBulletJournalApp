package br.com.dcastrobianca.myBuJo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dcastrobianca.myBuJo.collections.Collection;
import br.com.dcastrobianca.myBuJo.collections.CollectionRegistrationData;
import br.com.dcastrobianca.myBuJo.collections.CollectionRepository;
import jakarta.validation.Valid;

@RestController

public class CollectionsController {
    @Autowired
    private CollectionRepository collectionRepository;

    @RequestMapping ("/mycollections/add")
    @PostMapping
    @Transactional
    public void addCollection(@RequestBody @Valid CollectionRegistrationData collectionData){
        collectionRepository.save(new Collection(collectionData));
    }
}
