package com.example.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name="Staff")
public class Staff {
    @javax.persistence.Id
    @GeneratedValue
    private Integer Id;

    @Embedded
    private Person person;

    public Staff(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

