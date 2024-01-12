package com.worksonproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        this.docContent = ""; // Initialize content as empty
        this.lastUpdated = LocalDateTime.now();
    }

    // Method to create a new document with initial content
    public void createDocument(String initialContent) {
        this.docContent = initialContent;
        this.lastUpdated = LocalDateTime.now();
    }

    // Method to edit document content
    public void editDocument(String newContent) {
        this.docContent = newContent;
        this.lastUpdated = LocalDateTime.now();
    }

    // Method to delete document content
    public void deleteDocument() {
        this.docContent = "";
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters and setters
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

    public String getDocumentID() {
        return this.documentID;
    }

    // Method to get formatted last updated time
    public String getFormattedLastUpdated() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return this.lastUpdated.format(formatter);
    }

    // Additional getters and setters as needed
}
