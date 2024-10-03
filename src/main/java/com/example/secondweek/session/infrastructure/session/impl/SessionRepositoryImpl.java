package com.example.secondweek.session.infrastructure.session.impl;


import com.example.secondweek.session.domain.session.SessionRepository;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.jparepository.SessionInfoJpaRepository;
import com.example.secondweek.session.infrastructure.session.jparepository.SessionStudentInfoJpaRepository;
import com.example.secondweek.session.infrastructure.session.jparepository.StudentInfoJpaRepository;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class SessionRepositoryImpl implements SessionRepository {

    private final SessionInfoJpaRepository sessionInfoJpaRepository;
    private final SessionStudentInfoJpaRepository sessionStudentInfoJpaRepository;
    private final StudentInfoJpaRepository studentInfoJpaRepository;



    @Override
    public List<SessionInfoEntity> sessionList() {

        try {
            return sessionInfoJpaRepository.findAll();
        } catch (Exception e) {
            log.error("+++++++++++ SessionInfoRegister Fail");
            log.error(e.getMessage());
            log.error("+++++++++++");
        }
        return null;
    }

    @Override
    public boolean sessionInfoRegister(SessionInfoRegisterInfraRequest request) {
        try {
            SessionInfoRegisterInfraRequest result = new SessionInfoRegisterInfraRequest(
                request.id(),
                request.name(),
                request.professorName(),
                request.capacity(),
                request.date()
            );

            sessionInfoJpaRepository.save(result.toEntity());
            return true;

        } catch (Exception e) {
            log.error("+++++++++++ SessionInfoRegister Fail");
            log.error(e.getMessage());
            log.error("+++++++++++");
            return false;
        }
    }
}
