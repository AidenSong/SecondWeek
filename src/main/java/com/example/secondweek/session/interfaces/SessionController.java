package com.example.secondweek.session.interfaces;


import com.example.secondweek.session.domain.session.SessionService;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.interfaces.record.request.SessionInfoRegisterInterfacesRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




@RestController
@RequiredArgsConstructor
public class SessionController {


    private final SessionService sessionService;

    final String SUCCESS = "SUCCESS";
    final String FAIL = "FAIL";

    // Session 조회
    @GetMapping("/sessionList")
    public List<SessionInfoEntity> sessionList() {

        List<SessionInfoEntity> response = sessionService.sessionList();
        if (response.isEmpty()) {
            return null;
        }
        return response;
    }

    @GetMapping("/sessionInfoRegister")
    public String sessionInfoRegister(@RequestBody List<SessionInfoRegisterInterfacesRequest> requestList) {
        if (sessionService.sessionInfoRegister(requestList)) {
            return SUCCESS;
        }
        return FAIL;
    }







}
