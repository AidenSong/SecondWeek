package com.example.secondweek.session.domain.student.record.request;

import com.example.secondweek.session.infrastructure.student.record.request.StudentRegisterInfraRequest;


public record StudentRegisterDomainRequest(
    Long id,
    String name
) {

    public StudentRegisterInfraRequest toInfraRequest() {
        StudentRegisterInfraRequest infraFrame = new StudentRegisterInfraRequest(id,name);
        return infraFrame;
    }
}
