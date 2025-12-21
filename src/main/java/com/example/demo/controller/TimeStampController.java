package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.service.TimeStampService;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import jakarta.validation.Valid;

@RestController

public class TimeStampController{
    @Autowired TimeStampService ser;
    @PostMapping("/timepost")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity stu){
         return ser.postData(stu);
   }
}