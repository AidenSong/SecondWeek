package com.example.secondweek.session.interfaces;


import com.example.secondweek.session.domain.session.SessionService;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.interfaces.record.request.SessionInfoRegisterInterfacesRequest;
import com.example.secondweek.session.interfaces.record.request.SessionRegisterInterfacesRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequiredArgsConstructor
@Slf4j
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

    @PostMapping("/sessionInfoRegister")
    public String sessionInfoRegister(@RequestBody SessionInfoRegisterInterfacesRequest request) {
        if (sessionService.sessionInfoRegister(request)) {
            return SUCCESS;
        }
        return FAIL;
    }

    @PostMapping("/sessionRegister")
    public String sessionRegister(@RequestBody SessionRegisterInterfacesRequest request) {
        if (sessionService.sessionRegister(request)) {
            return SUCCESS;
        }
        return FAIL;
    }







}
