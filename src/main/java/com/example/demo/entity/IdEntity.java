package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;  


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdEntity{
    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private int idCardNo;

    @OneToOne
    @JoinColumn(name=)
    private studetails student;
    
}
