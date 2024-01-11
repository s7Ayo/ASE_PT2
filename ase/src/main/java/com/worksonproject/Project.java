package com.worksonproject;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Project {
    protected String projectID;
    protected String name;
    protected String description;
    protected String clientID;
    protected LocalDateTime lastUpdated;
    protected Map<String, Document> documents;
    protected Map<String, Email> emails;

    public Project(String projectID, String name, String description, String clientID) {
        this.projectID = projectID;
        this.name = name;
        this.description = description;
        this.clientID = clientID;
        this.lastUpdated = LocalDateTime.now();
        this.documents = new HashMap<>();
        this.emails = new HashMap<>();
    }

    public void addDocument(Document document) {
        documents.put(document.getDocumentID(), document);
    }

    public void editDocument(String documentID, String newContent) {
        if (documents.containsKey(documentID)) {
            documents.get(documentID).editDocument(newContent);
        }
    }

    public Document getDocument(String documentID) {
        return documents.get(documentID);
    }

    public void updateDocumentContent(String documentID, String newContent) {
        if (documents.containsKey(documentID)) {
            Document doc = documents.get(documentID);
            doc.editDocument(newContent); // Assuming editDocument method sets the new content
        } else {
            System.out.println("Document with ID " + documentID + " not found in project " + projectID);
        }
    }

    public void submitDocument(Document document) {
        documents.put(document.getDocumentID(), document);
    }

}
