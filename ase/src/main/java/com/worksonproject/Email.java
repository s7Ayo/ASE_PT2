package com.worksonproject;

public class Email {
    protected String emailID;
    protected String projectID;
    protected String subject;
    protected String content;

    public Email(String emailID, String projectID, String subject, String content) {
        this.emailID = emailID;
        this.projectID = projectID;
        this.subject = subject;
        this.content = content;
    }

    public void indexEmail() {
        // Indexing logic for emails
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void searchEmail() {
        // Email searching logic
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
