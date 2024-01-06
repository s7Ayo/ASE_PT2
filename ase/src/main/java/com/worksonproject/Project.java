package com.worksonproject;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Project {
    private String projectID;
    private String name;
    private String description;
    private String clientID;
    private LocalDateTime lastUpdated;
    private Map<String, Document> documents;

    public Project(String projectID, String name, String description, String clientID) {
        this.projectID = projectID;
        this.name = name;
        this.description = description;
        this.clientID = clientID;
        this.lastUpdated = LocalDateTime.now();
        this.documents = new HashMap<>();
    }

    // Getters and setters for project attributes
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    // Simplified getters and unimplemented methods
    public Document getDocument(String documentID) {
        return null; // Return null as per instruction
    }

    public void addDocument(Document document) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateStatus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void editDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void submitDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Private helper method
    private void updateLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }

    // Other existing methods...
}
