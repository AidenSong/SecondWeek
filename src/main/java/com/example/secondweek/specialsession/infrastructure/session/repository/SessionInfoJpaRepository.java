package com.example.secondweek.specialsession.infrastructure.session.repository;

import com.example.secondweek.specialsession.infrastructure.session.entity.SessionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionInfoJpaRepository extends JpaRepository<SessionInfoEntity, String> {
}
