package com.example.demo.repository;

import org.springframework.stereotypr.Repository;

@Repository 
public Interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
    
}