package com.example.secondweek.specialsession.infrastructure.session.entitiy;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SESSION_STUDENT_INFO")
public class SessionStudentInfoEntity {

    @Id
    private Long sessionId;
    private String sessionName;
    private String professorName;
    private int capacity;
    private String studentId;
    private String studentName;
}
