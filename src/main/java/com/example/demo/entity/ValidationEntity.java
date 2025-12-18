package com.example.demo.Entity;

import java.util.*; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Notnull;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Notnull
    @Size(min=2,maz=30,message)
    private String username;
    private String email;
    private String password;
    private Integer age;
       
}