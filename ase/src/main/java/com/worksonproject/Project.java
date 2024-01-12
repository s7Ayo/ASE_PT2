package com.worksonproject;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Project {
    protected String projectID;
    protected String name;
    protected String description;
    protected LocalDateTime lastUpdated;
    protected Map<String, Document> documents;
    protected Map<String, Email> emails;

    private Client client; // New property to store client information

    // Constructor updated to include the Client object
    public Project(String projectID, String name, String description, Client client) {
        this.projectID = projectID;
        this.name = name;
        this.description = description;
        this.client = client; // Assigning the client to the project
        this.lastUpdated = LocalDateTime.now();
        this.documents = new HashMap<>();
        this.emails = new HashMap<>();
    }

    // Method to add a document to the project
    public void addDocument(Document document) {
        documents.put(document.getDocumentID(), document);
    }

    // Method to update the content of a document within the project
    public void editDocument(String documentID, String newContent) {
        if (documents.containsKey(documentID)) {
            documents.get(documentID).editDocument(newContent);
        }
    }

    // Method to retrieve a document from the project
    public Document getDocument(String documentID) {
        return documents.get(documentID);
    }

    // Method to update the content of a specific document
    public void updateDocumentContent(String documentID, String newContent) {
        if (documents.containsKey(documentID)) {
            Document doc = documents.get(documentID);
            doc.editDocument(newContent);
        } else {
            System.out.println("Document with ID " + documentID + " not found in project " + projectID);
        }
    }

    // Method to submit a document to the project
    public void submitDocument(Document document) {
        documents.put(document.getDocumentID(), document);
    }

    // Getter for the project ID
    public String getProjectID() {
        return this.projectID;
    }

    // Getter and setter for the client
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Other methods like managing emails and additional project functionalities...
}
