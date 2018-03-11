package com.github.dannyhn.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address extends BaseDomain {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private long userId;
    
    private String city;
    
    private String zipcode;
}
