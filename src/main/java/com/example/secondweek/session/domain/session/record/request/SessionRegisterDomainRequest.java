package com.example.secondweek.session.domain.session.record.request;


import com.example.secondweek.session.infrastructure.session.record.request.SessionRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.session.request.SessionRegisterInterfacesRequest;





public record SessionRegisterDomainRequest(SessionRegisterInterfacesRequest interfacesRequest) {

    public SessionRegisterInfraRequest toInfraFrame() {
        SessionRegisterInfraRequest infraFrame = new SessionRegisterInfraRequest(
            interfacesRequest.sessionId(),
            interfacesRequest.studentId()
        );

        return infraFrame;
    }
}
