package com.example.secondweek.specialsession.infrastructure.session.jparepository;


import com.example.secondweek.specialsession.infrastructure.session.entitiy.SessionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionInfoJpaRepository extends JpaRepository<SessionInfoEntity, Long> {}
