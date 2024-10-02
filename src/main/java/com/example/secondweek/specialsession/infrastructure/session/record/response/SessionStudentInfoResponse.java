package com.example.secondweek.specialsession.infrastructure.session.record.response;

import java.time.LocalDate;



public record SessionStudentInfoResponse(
    String sessionId,
    String sessionName,
    String professorName,
    LocalDate date,
    String studentId,
    String studentName
    ) {
}
