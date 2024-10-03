package com.example.secondweek.session.domain.session;


import com.example.secondweek.session.domain.session.record.request.SessionInfoRegisterDomainRequest;
import com.example.secondweek.session.domain.session.record.request.SessionRegisterDomainRequest;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionStudentInfoEntity;
import com.example.secondweek.session.infrastructure.session.record.request.SessionInfoRegisterInfraRequest;
import com.example.secondweek.session.infrastructure.session.record.request.SessionRegisterInfraRequest;
import com.example.secondweek.session.interfaces.record.session.request.SessionInfoRegisterInterfacesRequest;
import com.example.secondweek.session.interfaces.record.session.request.SessionRegisterInterfacesRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SessionService {

    private final SessionRepository sessionRepository;


    @Transactional
    public List<SessionInfoEntity> sessionList() {
        return sessionRepository.sessionList();
    }


    @Transactional
    public boolean sessionInfoRegister(SessionInfoRegisterInterfacesRequest request) {

        SessionInfoRegisterInfraRequest infraFrame = new SessionInfoRegisterDomainRequest(request).toInfraFrame();
        return sessionRepository.sessionInfoRegister(infraFrame);
    }


    @Transactional
    public boolean sessionRegister(SessionRegisterInterfacesRequest request) {

        try {
            SessionRegisterInfraRequest infraRequest = new SessionRegisterDomainRequest(request).toInfraFrame();
            return sessionRepository.sessionRegister(infraRequest);

        } catch (Exception e) {
            log.error("+++++++++++ sessionRegister Fail");
            log.error(e.getMessage());
            log.error("+++++++++++");
        }
        return false;
    }


    @Transactional
    public List<SessionStudentInfoEntity> findByStudentId(Long studentId) {

        try {
            return sessionRepository.findByStudentId(studentId);
        } catch (Exception e) {
            log.error("+++++++++++ findByStudentId Fail");
            log.error(e.getMessage());
            log.error("+++++++++++");
        }
        return null;
    }
}
