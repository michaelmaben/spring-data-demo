package com.example.jpa.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private boolean fullTime;
    @Column
    private Integer age;
    @Embedded
    private Person attendee;

    public Student() {
    }

    public Student(Person attendee, boolean fullTime, Integer age) {
        this.fullTime = fullTime;
        this.age = age;
        this.attendee = attendee;
    }

    @OneToMany(fetch = FetchType.EAGER)
    private List<Course> courses;
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getAttendee() {
        return attendee;
    }

    public void setAttendee(Person attendee) {
        this.attendee = attendee;
    }
}
