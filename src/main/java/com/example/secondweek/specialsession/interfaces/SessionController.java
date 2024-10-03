package com.example.secondweek.specialsession.interfaces;


import com.example.secondweek.specialsession.domain.session.SessionService;
import com.example.secondweek.specialsession.infrastructure.session.entitiy.SessionInfoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
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







}
