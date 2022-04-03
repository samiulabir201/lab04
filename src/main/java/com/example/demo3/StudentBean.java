package com.example.demo3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.*;
/**
 * A simple javabean that represents a student entity.
 */

public class StudentBean implements Serializable {
    private int id;
    private String name;
    private String semester;
    private float cgpa;
    private int phone;

    public StudentBean() {
    }

    public StudentBean(int id, String name, String semester, float cgpa,int phone) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.cgpa= cgpa;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() { return semester; }

    public void setSemester(String semester) { this.semester = semester; }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) { this.cgpa = cgpa;}

    public int getPhone() {
        return phone;
    }

    public int setPhone(int phone) {
        this.phone = phone;
        return phone;
    }





    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                ", cgpa='"+ cgpa + '\''+
                ", phone='"+ phone + '\''+
                '}';
    }
}


