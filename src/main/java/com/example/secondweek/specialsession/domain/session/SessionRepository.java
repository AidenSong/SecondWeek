package com.example.secondweek.specialsession.domain.session;


import com.example.secondweek.specialsession.infrastructure.session.entitiy.SessionInfoEntity;

import java.util.List;

public interface SessionRepository {

    List<SessionInfoEntity> sessionList();
}
