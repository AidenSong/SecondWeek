package com.example.secondweek.specialsession.infrastructure.session.entitiy;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT_INFO")
public class StudentInfoEntity {

    @Id
    private Long id;
    private String name;
}
