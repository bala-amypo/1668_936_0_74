package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.StudentDetailsRepository;
import com.example.demo.service.StudentDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService{
        @Autowired StudentDetailsRepository student;
        @Override
        public StudentDetailsEntity postData(StudentDetailsEntity stu){
            return student.save(stu);
    }
}