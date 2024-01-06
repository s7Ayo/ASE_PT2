package com.worksonproject;
import java.time.LocalDateTime;

public class Document {
    protected String documentID;
    protected String projectID;
    protected String title;
    protected String docContent;
    protected LocalDateTime lastUpdated;

    // Constructor
    public Document(String documentID, String projectID, String title) {
        this.documentID = documentID;
        this.projectID = projectID;
        this.title = title;
        this.lastUpdated = LocalDateTime.now();
    }

    public void createDocument() {
        this.docContent = "";
        this.lastUpdated = LocalDateTime.now();
    }

    public void editDocument(String newContent) {
        this.docContent = newContent;
        this.lastUpdated = LocalDateTime.now();
    }

    public void deleteDocument() {
        this.docContent = "";
        this.lastUpdated = LocalDateTime.now();
    }

    public String getContent() {
        return this.docContent;
    }

    public void setContent(String newContent) {
        this.docContent = newContent;
        this.lastUpdated = LocalDateTime.now();
    }

    public LocalDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    // Method to get the document ID
    public String getDocumentID() {
        return this.documentID;
    }
}
