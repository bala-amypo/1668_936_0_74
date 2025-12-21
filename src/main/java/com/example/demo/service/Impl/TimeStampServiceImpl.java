package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.service.TimeStampService;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Service
public class TimeStampServiceImpl implements TimeStampService{
        @Autowired TimeStampRepository student;
        @Override
        public TimeStampEntity postData(TimeStampEntity stu){
            return student.save(stu);
    }
}