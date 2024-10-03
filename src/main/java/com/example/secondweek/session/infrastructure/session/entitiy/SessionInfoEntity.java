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
@Table(name = "SESSION_INFO")
public class SessionInfoEntity {
    @Id
    private Long id;
    private String name;
    private String professorName;
    private int capacity;
    private LocalDate date;
}
