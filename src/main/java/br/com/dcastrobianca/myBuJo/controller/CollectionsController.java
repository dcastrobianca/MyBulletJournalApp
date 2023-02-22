package br.com.dcastrobianca.myBuJo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dcastrobianca.myBuJo.collections.Collection;
import br.com.dcastrobianca.myBuJo.collections.dto.CollectionListData;
import br.com.dcastrobianca.myBuJo.collections.dto.CollectionRegistrationData;
import br.com.dcastrobianca.myBuJo.collections.CollectionRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping ("/mycollections")
public class CollectionsController {
    @Autowired
    private CollectionRepository collectionRepository;

    
    @PostMapping
    @Transactional
    public void addCollection(@RequestBody @Valid CollectionRegistrationData collectionData){
        collectionRepository.save(new Collection(collectionData));
    }

    @GetMapping
    public Page<CollectionListData> listCollection(@PageableDefault (size = 5) Pageable page){
        return collectionRepository.findAll(page).map(CollectionListData::new);
    }
}
