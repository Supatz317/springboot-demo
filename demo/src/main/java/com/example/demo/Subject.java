package com.example.demo;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String SubjectName;

    
    public Subject() {
    }

    public Subject(String SubjectName) {
        this.SubjectName = SubjectName;
    }


    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }
    
    public String getSubjectName() {
        return SubjectName;
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}
