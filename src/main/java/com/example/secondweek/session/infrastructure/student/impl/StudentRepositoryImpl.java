package com.example.secondweek.session.infrastructure.student.impl;


import com.example.secondweek.session.domain.student.StudentRepository;
import com.example.secondweek.session.domain.student.record.request.StudentRegisterDomainRequest;
import com.example.secondweek.session.infrastructure.record.StudentRegisterInfraRequest;
import com.example.secondweek.session.infrastructure.student.entity.StudentInfoEntity;
import com.example.secondweek.session.infrastructure.student.jparepository.StudentInfoJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class StudentRepositoryImpl implements StudentRepository {

    private final StudentInfoJpaRepository studentInfoJpaRepository;

    public boolean studentRegister(StudentRegisterDomainRequest domainRequest) {

        try {


            StudentInfoEntity entity = new StudentRegisterInfraRequest(domainRequest.id(), domainRequest.name()).toEntity();
            studentInfoJpaRepository.save(entity);

            return true;
        } catch (Exception e) {
            log.error("========== studentRegister Fail");
            log.error(e.getMessage());
            log.error("========== ");
        }
        return false;
    }
}
