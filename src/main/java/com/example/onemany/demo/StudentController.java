package com.example.onemany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController
{
    @Autowired
    StudentService service;
    @RequestMapping("/details")
    public Student insert()
    {
        return (Student) service.insert();
    }





}
