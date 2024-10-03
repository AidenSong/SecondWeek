package com.example.secondweek.session.domain.session.record.request;


import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.request.SessionInfoRegisterInterfacesRequest;

import java.util.ArrayList;
import java.util.List;





public record SessionInfoRegisterDomainRequest(List<SessionInfoRegisterInterfacesRequest> requestList) {



    public List<SessionInfoRegisterInfraRequest> toSessionInfoRegisterInfraFrame() {
        List<SessionInfoRegisterInfraRequest> list = new ArrayList<>();
        for (SessionInfoRegisterInterfacesRequest request: requestList) {
            SessionInfoRegisterInfraRequest infraFrame = new SessionInfoRegisterInfraRequest(
                request.id(),
                request.name(),
                request.professorName(),
                request.capacity(),
                request.date()
            );
            list.add(infraFrame);
        }
        return list;
    }
}
