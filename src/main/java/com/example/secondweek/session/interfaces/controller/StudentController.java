package com.example.secondweek.session.interfaces.controller;


import com.example.secondweek.session.domain.student.StudentService;
import com.example.secondweek.session.interfaces.record.student.request.StudentRegisterInterfaceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.secondweek.session.common.CommonVariable.FAIL;
import static com.example.secondweek.session.common.CommonVariable.SUCCESS;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping("/studentRegister")
    public String studentRegister(@RequestBody StudentRegisterInterfaceRequest interfaceRequest){

        if (studentService.studentRegister(interfaceRequest)) {
            return SUCCESS;
        }
        return FAIL;
    }
}
