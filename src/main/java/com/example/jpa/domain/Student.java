package com.example.jpa.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

    @Column
    private boolean fullTime;
    @Column
    private Integer age;
    @Embedded
    private Person attendee;

    public Student() {
    }

    @OneToMany(fetch = FetchType.EAGER)
    private List<Course> courses;
    public String getId() {
        return Id;
    }

    public void setId(String id) {
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
