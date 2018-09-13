package com.dao;

import com.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    @Autowired
    HibernateTemplate hibernateTemplate;
    public StudentEntity findById(int id){
        return hibernateTemplate.get(StudentEntity.class,id);
    }
}
