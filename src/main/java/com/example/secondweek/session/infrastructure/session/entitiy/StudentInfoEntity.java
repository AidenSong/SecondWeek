package com.example.secondweek.session.infrastructure.session.entitiy;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "STUDENT_INFO")
public class StudentInfoEntity {

    @Id
    private Long id;
    private String name;
}
