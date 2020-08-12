package com.example.onemany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Component
public class StudentService {
    @Autowired
    StudentRepository repository;

    public Student insert()
    {
        Student s1 = new Student();
        s1.setSid(1);
        s1.setSname("Pavan");
        Student s2 = new Student();
        s2.setSid(2);
        s2.setSname("LAVA");
        Department d = new Department();
        d.setDid(1);
        d.setDname("CSE");
        s1.setDepartment(d);
        s2.setDepartment(d);
        HashSet<Student> set = new HashSet<Student>();
        set.add(s1);
        repository.save(s1);
        set.add(s2);
        repository.save(s2);
        return s1;
    }
}

