package com.chenjun.model;

/**
 * Function Desc: TODO
 * Date:2018/5/8 21:27
 * author:jun.chen02@hand-china.com
 */
public class User {
    private String name;
    private int age;
    private Grade grade;
    private ClassMate classMate;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public ClassMate getClassMate() {
        return classMate;
    }

    public void setClassMate(ClassMate classMate) {
        this.classMate = classMate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
