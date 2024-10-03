package com.example.secondweek.specialsession.infrastructure.session.impl;


import com.example.secondweek.specialsession.domain.session.SessionRepository;
import com.example.secondweek.specialsession.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.specialsession.infrastructure.session.jparepository.SessionInfoJpaRepository;
import com.example.secondweek.specialsession.infrastructure.session.jparepository.SessionStudentInfoJpaRepository;
import com.example.secondweek.specialsession.infrastructure.session.jparepository.StudentInfoJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SessionRepositoryImpl implements SessionRepository {

    private final SessionInfoJpaRepository sessionInfoJpaRepository;
    private final SessionStudentInfoJpaRepository sessionStudentInfoJpaRepository;
    private final StudentInfoJpaRepository studentInfoJpaRepository;



    @Override
    public List<SessionInfoEntity> sessionList() {
        return sessionInfoJpaRepository.findAll();
    }
}
