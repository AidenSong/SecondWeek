package com.example.secondweek.session.interfaces.controller;


import com.example.secondweek.session.domain.session.SessionService;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionInfoEntity;
import com.example.secondweek.session.infrastructure.session.entitiy.SessionStudentInfoEntity;
import com.example.secondweek.session.interfaces.record.session.request.SessionInfoRegisterInterfacesRequest;
import com.example.secondweek.session.interfaces.record.session.request.SessionRegisterInterfacesRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.secondweek.session.common.CommonVariable.FAIL;
import static com.example.secondweek.session.common.CommonVariable.SUCCESS;


@RestController
@RequestMapping("/session")
@RequiredArgsConstructor
@Slf4j
public class SessionController {


    private final SessionService sessionService;


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

    @GetMapping("findByStudentId")
    public List<SessionStudentInfoEntity> findSessionByStudentId(@RequestParam Long studentId){
        List<SessionStudentInfoEntity> response = sessionService.findByStudentId(studentId);
        if (response.isEmpty()) {
            return null;
        }
        return response;
    }
}
