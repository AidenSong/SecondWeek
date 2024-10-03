package com.example.secondweek.session.domain.session.record.request;


import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.session.request.SessionInfoRegisterInterfacesRequest;


public record SessionInfoRegisterDomainRequest(SessionInfoRegisterInterfacesRequest request) {



    public SessionInfoRegisterInfraRequest toInfraFrame() {
        SessionInfoRegisterInfraRequest infraFrame = new SessionInfoRegisterInfraRequest(
            request.id(),
            request.name(),
            request.professorName(),
            request.capacity(),
            request.date()
        );
        return infraFrame;
    }
}
