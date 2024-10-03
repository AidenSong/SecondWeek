package com.example.secondweek.session.domain.session;


import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;

import java.util.List;

public interface SessionRepository {

    List<SessionInfoEntity> sessionList();

    boolean sessionInfoRegister(SessionInfoRegisterInfraRequest request);
}
