package com.example.secondweek.specialsession.infrastructure.session.entitiy;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "SESSION_INFO")
public class SessionInfoEntity {
    @Id
    private Long id;
    private String name;
    private String professorName;
    private int capacity;
    private LocalDate date;
}
