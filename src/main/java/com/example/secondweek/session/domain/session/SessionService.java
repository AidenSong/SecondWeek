package com.example.secondweek.session.domain.session;


import com.example.secondweek.session.domain.session.record.request.SessionInfoRegisterDomainRequest;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.request.SessionInfoRegisterInterfacesRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;


    final String SUCCESS = "SUCCESS";
    final String FAIL = "FAIL";


    public List<SessionInfoEntity> sessionList() {
        return sessionRepository.sessionList();
    }

    public String sessionInfoRegister(List<SessionInfoRegisterInterfacesRequest> requestList) {

        List<SessionInfoRegisterInfraRequest> infraFrame = new SessionInfoRegisterDomainRequest(requestList).toSessionInfoRegisterInfraFrame();
        if (sessionRepository.sessionInfoRegister(infraFrame)) {
            return SUCCESS;
        }
        return FAIL;
    }
}
