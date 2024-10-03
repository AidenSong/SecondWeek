package com.example.secondweek.specialsession.infrastructure.session.jparepository;


import com.example.secondweek.specialsession.infrastructure.session.entitiy.StudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfoJpaRepository extends JpaRepository<StudentInfoEntity, Long> {}
