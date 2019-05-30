package com.whitecloak.projectlombok.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "email")
    String email;
    @Column(name = "phone_no")
    String phoneNo;
    @Column(name = "date_of_birth")
    LocalDate dateCreated;
    @Column(name = "is_active")
    Boolean isActive;

    public User() {
        super();
    }

    public User(String firstName, String lastName, String email, String phoneNo, LocalDate dateCreated, Boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dateCreated = dateCreated;
        this.isActive = isActive;
    }
}