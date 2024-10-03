package com.example.secondweek.session.infrastructure.session.jparepository;


import com.example.secondweek.session.infrastructure.session.entitiy.StudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfoJpaRepository extends JpaRepository<StudentInfoEntity, Long> {}
