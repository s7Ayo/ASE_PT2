package com.example;

import com.worksonproject.Client;
import com.worksonproject.Document;
import com.worksonproject.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    private Project project;
    private Client client;
    private Document document;
    private final String documentID = "doc1";
    private final String projectID = "proj123";
    private final String newContent = "Updated content";

    @BeforeEach
    void setUp() {
        client = new Client("clientID", "Client Name", "client@email.com", "1234567890", "Client Address",
                "Client Organization");
        project = new Project(projectID, "Project Name", "Project Description", client);
        document = new Document(documentID, projectID, "Document Title");
    }

    @Test
    void testAddAndRetrieveDocument() {
        project.addDocument(document);
        assertEquals(document, project.getDocument(documentID), "Retrieved document should match the one added");
    }

    @Test
    void testEditDocument() {
        project.addDocument(document);
        project.editDocument(documentID, newContent);
        assertEquals(newContent, project.getDocument(documentID).getContent(),
                "Document content should be updated after edit");
    }

    @Test
    void testUpdateDocumentContent() {
        project.addDocument(document);
        project.updateDocumentContent(documentID, newContent);
        assertEquals(newContent, project.getDocument(documentID).getContent(), "Document content should be updated");
    }

    @Test
    void testGetProjectID() {
        assertEquals(projectID, project.getProjectID(), "Project ID should be correctly retrieved");
    }

    @Test
    void testClientGetterAndSetter() {
        Client newClient = new Client("newClientID", "New Client Name", "newclient@email.com", "0987654321",
                "New Client Address", "New Client Organization");
        project.setClient(newClient);
        assertEquals(newClient, project.getClient(), "Client should be correctly set and retrieved");
    }

    // Additional tests can be written for other functionalities, if they exist
}