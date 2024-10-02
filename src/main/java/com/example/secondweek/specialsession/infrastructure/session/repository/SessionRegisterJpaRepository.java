package com.example.secondweek.specialsession.infrastructure.session.repository;

import com.example.secondweek.specialsession.infrastructure.session.record.request.SessionRegisterRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRegisterJpaRepository extends JpaRepository<SessionRegisterRequest, String> {
}
