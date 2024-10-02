
package com.example.secondweek.specialsession.domain.session;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class SessionEntity {

    @Id
    private String id;

    private String name;

    private String professorName;

    private LocalDate date;
}
