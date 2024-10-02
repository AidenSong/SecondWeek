package com.example.secondweek.specialsession.infrastructure.session.record.response;

import java.time.LocalDate;

public record SessionInfoResponse(String id, String name, String professorName, LocalDate date) {
}
