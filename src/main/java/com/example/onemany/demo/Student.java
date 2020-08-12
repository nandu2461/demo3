package com.example.onemany.demo;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Table
@Entity
public class Student extends HashSet<Student> {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int sid;
    private String sname;
    private Department department;
    public Student()
    {

    }
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;


    }
    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }
}
