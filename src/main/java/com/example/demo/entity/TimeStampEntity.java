package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;  
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @PrePersist
    
    public void Oncreate(){
    LocalDateTime now =  LocalDateTime.now();
        this.createAt=now;
        this.updateAt=now;
    }
    @PreUpdate
    LocalDateTime now =  LocalDateTime.now();
    public void Onupdate(){
    this.updateAt=now;
    }
}
