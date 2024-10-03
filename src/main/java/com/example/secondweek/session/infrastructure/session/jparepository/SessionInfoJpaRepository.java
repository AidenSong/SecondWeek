package com.example.secondweek.session.infrastructure.session.jparepository;


import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionInfoJpaRepository extends JpaRepository<SessionInfoEntity, Long> {}
