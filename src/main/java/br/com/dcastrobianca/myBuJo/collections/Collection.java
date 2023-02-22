package br.com.dcastrobianca.myBuJo.collections;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;


@Entity
@Table (name = "collections")
public class Collection {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated (EnumType.STRING)
    private CollectionType type;
    @Column (name="start_date")
    private LocalDate startDate;
    @Column (name="end_date")
    private LocalDate endDate;


    public Collection() {
    }


    

    public Collection(@Valid CollectionRegistrationData data) {
        this.name = data.name();
        this.type = data.collectionType();
        this.startDate = data.startDate();
        this.endDate = data.endDate();
    }
}
