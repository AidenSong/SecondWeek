package com.example.secondweek.session.domain.session;


import com.example.secondweek.session.domain.session.record.request.SessionInfoRegisterDomainRequest;
import com.example.secondweek.session.domain.session.record.request.SessionRegisterDomainRequest;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.infrastructure.session.record.request.SessionRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.request.SessionInfoRegisterInterfacesRequest;
import com.example.secondweek.session.interfaces.record.request.SessionRegisterInterfacesRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;


    public List<SessionInfoEntity> sessionList() {
        return sessionRepository.sessionList();
    }

    public boolean sessionInfoRegister(SessionInfoRegisterInterfacesRequest request) {

        SessionInfoRegisterInfraRequest infraFrame = new SessionInfoRegisterDomainRequest(request).toInfraFrame();
        return sessionRepository.sessionInfoRegister(infraFrame);
    }

    public boolean sessionRegister(SessionRegisterInterfacesRequest request) {

        SessionRegisterInfraRequest infraRequest = new SessionRegisterDomainRequest(request).toInfraFrame();
        return sessionRepository.sessionRegister(infraRequest);
    }
}
