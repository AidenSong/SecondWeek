package com.example.secondweek.specialsession.infrastructure.session.repository;

import com.example.secondweek.specialsession.infrastructure.session.entity.SessionStudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionStudentInfoJpaRepository extends JpaRepository<SessionStudentInfoEntity, String> {
}
