package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import jakarta.validation.Valid;

@RestController

public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
         return ser.postData(stu);
   }
   @GetMapping("/get")
   public List<StudentEntity> getval(){
    return ser.getAllData();
   }
   @DeleteMapping("/delete/{id}")
   public String deleteval(@PathVariable int id){
    return ser.DeleteData(id);
   }
   @GetMapping("/find/{id}")
   public StudentEntity find(@PathVariable int id){
    return ser.getData(id);
   }
   @PutMapping("/put/{id}")
   public StudentEntity putvalue(@PathVariable int id,@RequestBody StudentEntity entity){
    return ser.updateData(id,entity);
   }
}
