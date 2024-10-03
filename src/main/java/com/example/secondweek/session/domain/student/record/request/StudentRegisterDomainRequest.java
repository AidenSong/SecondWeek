package com.example.secondweek.session.domain.student.record.request;

import com.example.secondweek.session.infrastructure.record.StudentRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.student.request.StudentRegisterInterfaceRequest;






public record StudentRegisterDomainRequest(
    Long id,
    String name
) {

    public StudentRegisterInfraRequest toInfraRequest() {
        StudentRegisterInfraRequest infraFrame = new StudentRegisterInfraRequest(id,name);
        return infraFrame;
    }
}
