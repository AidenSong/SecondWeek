package com.example.secondweek.session.domain.student;

import com.example.secondweek.session.domain.student.record.request.StudentRegisterDomainRequest;




public interface StudentRepository {

    boolean studentRegister(StudentRegisterDomainRequest domainRequest);
}
