package com.example.secondweek.session.domain.session;


import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionStudentInfoEntity;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.infrastructure.session.record.request.SessionRegisterInfraRequest;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.Lock;

import java.util.List;




public interface SessionRepository {

    List<SessionInfoEntity> sessionList();

    boolean sessionInfoRegister(SessionInfoRegisterInfraRequest request);

    @Lock(LockModeType.READ)
    boolean sessionRegister(SessionRegisterInfraRequest request);

    List<SessionStudentInfoEntity> findByStudentId(Long studentId);
}
