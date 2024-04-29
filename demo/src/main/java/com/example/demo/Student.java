package com.example.demo;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int id;

    @NonNull
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
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
    

}
