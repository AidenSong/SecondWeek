package com.example.secondweek.session.infrastructure.session.jparepository;


import com.example.secondweek.session.infrastructure.session.entitiy.SessionStudentInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionStudentInfoJpaRepository extends JpaRepository<SessionStudentInfoEntity, Long> {

    List<SessionStudentInfoEntity> findByStudentId(Long studentId);
}
