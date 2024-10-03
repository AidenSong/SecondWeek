package com.example.secondweek.session.infrastructure.session.record.request;


import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;

import java.time.LocalDate;

public record SessionInfoRegisterInfraRequest(
    Long id,
    String name,
    String professorName,
    int capacity,
    LocalDate date
) {
    public SessionInfoEntity toEntity() {
        SessionInfoEntity entity = new SessionInfoEntity();
        entity.setId(id);
        entity.setName(name);
        entity.setProfessorName(professorName);
        entity.setCapacity(capacity);
        entity.setDate(date);

        return entity;
    }
}
