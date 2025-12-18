package com.example.demo.Entity;

import java.util.*; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Notnull;
import jakarta.validation.constraints.Size;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Notnull
    @Size(min=2,max=10,message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=7,max=15,message="must be 7 to 15 character")
    @Notnull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age must be positive")
    private Integer age;

    
       
}