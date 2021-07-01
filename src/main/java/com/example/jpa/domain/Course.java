package com.example.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn
    private Department department;

    public Course() {
    }

    public Course(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
