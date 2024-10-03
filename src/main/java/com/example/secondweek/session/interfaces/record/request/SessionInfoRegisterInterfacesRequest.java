package com.example.secondweek.session.interfaces.record.request;


import java.time.LocalDate;

public record SessionInfoRegisterInterfacesRequest(
    Long id,
    String name,
    String professorName,
    int capacity,
    LocalDate date
) {}
