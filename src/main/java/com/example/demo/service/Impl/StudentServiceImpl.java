package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
        @Autowired StudentRepository student;
        @Override
        public StudentEntity postData(StudentEntity stu){
            return student.save(stu);
        }
        @Override
        public List<StudentEntity>getAllData(){
            return student.findAll();
        }
        @Override
        public String DeleteData(@PathVariable int id){
               student.deleteById(id);
               return "Deleted successfully";
        }
        @Override
         public StudentEntity getData(int id){
            
         }
}
