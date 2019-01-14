package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer stuID;
    private String stuName;
    private String stuphone;
    private String stuAddress;

    public Integer getStuID()
    {
        return stuID;
    }
    public void setStuID(Integer stuID)
    {
        this.stuID=stuID;
    }
    public String getStuName()
    {
        return  stuName;
    }
    public void setStuName(String stuName)
    {
        this.stuName=stuName;
    }
    public String getStuphone()
    {
        return stuphone;
    }
    public void setStuphone(String stuphone)
    {
        this.stuphone=stuphone;
    }
    public  String getStuAddress()
    {
        return  stuAddress;
    }
    public void setStuAddress(String stuAddress)
    {
        this.stuAddress=stuAddress;
    }
}
