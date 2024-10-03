package com.example.secondweek.session.infrastructure.student.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "STUDENT_INFO")
public class StudentInfoEntity {

    @Id
    private Long id;
    private String name;
}
