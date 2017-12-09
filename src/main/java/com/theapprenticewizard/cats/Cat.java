package com.theapprenticewizard.cats;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Cat {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    public Cat(String name) {
        this.name = name;
    }
}
