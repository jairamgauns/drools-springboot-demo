package com.example.demopep.services.drools;

import com.example.demopep.model.Applicant;
import com.example.demopep.services.impl.ProcessDocumentService;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessApplicantService {

    private KieContainer kieContainer;

    @Autowired
    private ProcessDocumentService processDocumentService;

    @Autowired
    public ProcessApplicantService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public String process(Applicant applicant) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("processDocumentService", processDocumentService);
        kieSession.insert(applicant);
        kieSession.fireAllRules();
        kieSession.dispose();
        System.out.println("!! Applicant Status !! " + applicant.getState());
        return applicant.getState().getState();
    }
}
