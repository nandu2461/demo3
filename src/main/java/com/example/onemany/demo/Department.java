package com.example.onemany.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int did;
    private String dname;
    public Department()
    {

    }
    public int getDid()
    {
        return did;
    }

    public void setDid(int did)
    {
        this.did = did;
    }

    public String getDname()
    {
        return dname;
    }

    public void setDname(String dname)
    {
        this.dname = dname;
    }
}