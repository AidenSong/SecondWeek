package com.example.secondweek.session.infrastructure.record;


import com.example.secondweek.session.infrastructure.student.entity.StudentInfoEntity;

public record StudentRegisterInfraRequest(
    Long id,
    String name
) {

    public StudentInfoEntity toEntity() {
        StudentInfoEntity entity = new StudentInfoEntity();
        entity.setId(id);
        entity.setName(name);

        return entity;
    }
}
