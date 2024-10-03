package com.example.secondweek.session.infrastructure.session.jparepository;


import com.example.secondweek.session.infrastructure.session.entitiy.SessionStudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionStudentInfoJpaRepository extends JpaRepository<SessionStudentInfoEntity, Long> {}
