package com.example.demo.service.Impl;

@Service
public class ValidationServiceImpl implements ValidationService{
        @Autowired ValidationRepository student;
        @Override
        public ValidationEntity postData(ValidationEntity stu){
            return student.save(val);
        }
}