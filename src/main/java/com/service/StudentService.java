package com.service;

import com.dao.StudentDao;
import com.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;
    public StudentEntity findById(int id){
        return studentDao.findById(id);
    }
}
