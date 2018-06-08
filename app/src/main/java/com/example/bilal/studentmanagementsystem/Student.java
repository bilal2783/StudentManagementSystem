package com.example.bilal.studentmanagementsystem;

public class Student
{
    String name,address,college;
    long phone;
    public Student(String name,String address,String college,long phone)
    {
        this.name=name;
        this.address=address;
        this.college=college;
        this.phone=phone;
    }

    public long getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCollege() {
        return college;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
