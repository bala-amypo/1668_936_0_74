package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotypr.Repository;
import com.example.demo.entity.StudentEntity;

@Repository 
public Interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
    
}