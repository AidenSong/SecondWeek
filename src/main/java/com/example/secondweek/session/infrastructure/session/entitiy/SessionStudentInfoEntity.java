package com.example.secondweek.session.infrastructure.session.entitiy;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "SESSION_STUDENT_INFO")
public class SessionStudentInfoEntity {

    @Id
    private Long sessionId;
    private String sessionName;
    private String professorName;
    private int capacity;
    private LocalDate date;
    private Long studentId;
    private String studentName;
}
