package com.example.secondweek.specialsession.infrastructure.session.jparepository;


import com.example.secondweek.specialsession.infrastructure.session.entitiy.SessionStudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionStudentInfoJpaRepository extends JpaRepository<SessionStudentInfoEntity, Long> {}
