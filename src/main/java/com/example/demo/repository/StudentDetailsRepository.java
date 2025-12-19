package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.StudentDetailsEntity;

@Repository 
public interface StudentDetailsRepository extends JpaRepository<StudentDetailsEntity,Integer>{
    
}