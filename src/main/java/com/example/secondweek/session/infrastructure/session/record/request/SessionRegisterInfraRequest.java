package com.example.secondweek.session.infrastructure.session.record.request;


import com.example.secondweek.session.domain.session.record.request.SessionRegisterDomainRequest;

import java.time.LocalDate;

public record SessionRegisterInfraRequest(
    Long sessionId,
    Long studentId
) { }
