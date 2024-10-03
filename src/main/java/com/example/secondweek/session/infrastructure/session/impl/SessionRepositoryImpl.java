package com.example.secondweek.session.infrastructure.session.impl;


import com.example.secondweek.session.domain.session.SessionRepository;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionStudentInfoEntity;
import com.example.secondweek.session.infrastructure.session.entitiy.StudentInfoEntity;
import com.example.secondweek.session.infrastructure.session.jparepository.SessionInfoJpaRepository;
import com.example.secondweek.session.infrastructure.session.jparepository.SessionStudentInfoJpaRepository;
import com.example.secondweek.session.infrastructure.session.jparepository.StudentInfoJpaRepository;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.infrastructure.session.record.request.SessionRegisterInfraRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
            sessionInfoJpaRepository.save(request.toEntity());
            return true;

        } catch (Exception e) {
            log.error("+++++++++++ SessionInfoRegister Fail");
            log.error(e.getMessage());
            log.error("+++++++++++");
            return false;
        }
    }

    @Override
    public boolean sessionRegister(SessionRegisterInfraRequest request) {

        SessionStudentInfoEntity entity = new SessionStudentInfoEntity();

        Optional<SessionInfoEntity> sessionInfo = sessionInfoJpaRepository.findById(request.sessionId());
        Optional<StudentInfoEntity> studentInfo = studentInfoJpaRepository.findById(request.studentId());

        if (sessionInfo.isPresent() && studentInfo.isPresent()) {
            entity.setSessionId(sessionInfo.get().getId());
            entity.setSessionName(sessionInfo.get().getName());
            entity.setProfessorName(sessionInfo.get().getProfessorName());
            entity.setCapacity(sessionInfo.get().getCapacity());
            entity.setDate(sessionInfo.get().getDate());
            entity.setStudentId(studentInfo.get().getId());
            entity.setStudentName(studentInfo.get().getName());

            sessionStudentInfoJpaRepository.save(entity);
            return true;
        }
        return false;
    }
}
