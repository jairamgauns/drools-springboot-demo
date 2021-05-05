package com.example.demopep.controller;

import com.example.demopep.model.Applicant;
import com.example.demopep.services.drools.ProcessApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicantController {

    @Autowired
    ProcessApplicantService processApplicantService;

    @PostMapping(value = "/process/applicant")
    public String process(@RequestBody Applicant applicant) {
       System.out.println("applicant" + applicant);
       return processApplicantService.process(applicant);
    }
}
