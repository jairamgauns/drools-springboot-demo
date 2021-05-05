package com.example.demopep.services.impl;

import com.example.demopep.model.Applicant;
import org.springframework.stereotype.Service;

@Service
public class ProcessDocumentService {

    public boolean processDocument(Applicant applicant) {
        System.out.println("Document is processed for applicant: "+ applicant.getApplicantId());
        if(applicant.getApplicantId().equals("111")){
            return false;
        }
        return true;
    }
}
