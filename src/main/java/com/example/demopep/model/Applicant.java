package com.example.demopep.model;

import com.example.demopep.enums.State;

import java.util.List;

public class Applicant {
    private String applicantId;
    private String firstName;
    private String lastName;
    List<DocumentMetaData> list;
    private State state;

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<DocumentMetaData> getList() {
        return list;
    }

    public void setList(List<DocumentMetaData> list) {
        this.list = list;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static class DocumentMetaData {
        private String documentId;
        private String documentName;

        public String getDocumentId() {
            return documentId;
        }

        public void setDocumentId(String documentId) {
            this.documentId = documentId;
        }

        public String getDocumentName() {
            return documentName;
        }

        public void setDocumentName(String documentName) {
            this.documentName = documentName;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("DocumentMetaData{");
            sb.append("documentId='").append(documentId).append('\'');
            sb.append(", documentName='").append(documentName).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Applicant{");
        sb.append("applicantId='").append(applicantId).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
