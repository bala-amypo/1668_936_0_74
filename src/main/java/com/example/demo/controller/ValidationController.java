package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/valpost")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity val){
         return ser.postData(val);
   }
}