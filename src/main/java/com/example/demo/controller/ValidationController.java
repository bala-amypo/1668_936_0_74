package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import jakarta.validation.Valid;

@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/valpost")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity val){
         return ser.postdata(val);
   }
   
   @GetMapping("/valfind/{id}")
   public ValidationEntity find(@PathVariable Long id){
    return ser.getdata(id);
   }

}