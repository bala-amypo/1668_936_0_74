package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@Service
public class ValidationServiceImpl implements ValidationService{
        @Autowired ValidationRepository student;
        @Override
        public ValidationEntity postData(ValidationEntity val){
            return student.save(val);
        }
        @Override
         public StudentEntity getData(int id){
            return student.findById(id).orElse(null);
         }
}