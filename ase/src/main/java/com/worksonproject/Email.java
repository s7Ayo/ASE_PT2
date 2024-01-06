package com.worksonproject;

public class Email {
    private String emailID;
    private String projectID;
    private String subject;
    private String content;

    // Constructor
    public Email(String emailID, String projectID, String subject, String content) {
        this.emailID = emailID;
        this.projectID = projectID;
        this.subject = subject;
        this.content = content;
    }

    // Methods to index and search emails
    public void indexEmail() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void searchEmail(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Getters and setters
    public String getEmailID() {
        return emailID == null ? "" : emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID == null ? "" : emailID;
    }

    public String getProjectID() {
        return projectID == null ? "" : projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID == null ? "" : projectID;
    }

    public String getSubject() {
        return subject == null ? "" : subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? "" : subject;
    }

    public String getContent() {
        return content == null ? "" : content;
    }

    public void setContent(String content) {
        this.content = content == null ? "" : content;
    }
}
