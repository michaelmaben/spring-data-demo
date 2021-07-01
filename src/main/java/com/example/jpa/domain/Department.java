package com.example.jpa.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private String name;

    @OneToOne
    private Staff chair;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Course> courses;

    public Department() {
        super();
    }

    public Department(String name, Staff chair) {
        this.name = name;
        this.chair = chair;
    }

    public Department(String name) {
        super();
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Staff getChair() {
        return chair;
    }

    public void setChair(Staff chair) {
        this.chair = chair;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
