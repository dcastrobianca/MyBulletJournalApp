package br.com.dcastrobianca.myBuJo.collections;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CollectionRegistrationData (
    @NotBlank String name,
    @NotNull CollectionType collectionType,

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy-MM-dd") 
    @JsonFormat(pattern = "yyyy-MM-dd") 
    LocalDate startDate,

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy-MM-dd") 
    @JsonFormat(pattern = "yyyy-MM-dd") 
    LocalDate endDate
) {

}
