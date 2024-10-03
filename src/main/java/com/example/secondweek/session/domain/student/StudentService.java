package com.example.secondweek.session.domain.student;


import com.example.secondweek.session.domain.student.record.request.StudentRegisterDomainRequest;
import com.example.secondweek.session.interfaces.record.student.request.StudentRegisterInterfaceRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    @Transactional
    public boolean studentRegister(StudentRegisterInterfaceRequest interfaceRequest) {

        StudentRegisterDomainRequest domainRequest = new StudentRegisterDomainRequest(interfaceRequest.id(),  interfaceRequest.name());
        return studentRepository.studentRegister(domainRequest);
    }
}
