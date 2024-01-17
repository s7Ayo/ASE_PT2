package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import com.worksonproject.*;

class KMSImplementationTest {

    private KMSImplementation kms;
    private Project project;
    private Employee employee;
    private Document document;

    @BeforeEach
    void setUp() {
        kms = new KMSImplementation();
        project = new Project("proj123", "AI Project", "A project description",
                new Client("client123", "Name", "Email", "Phone", "Address", "Organization"));
        employee = new Employee(" ", "John Doe", "john.doe@example.com", "password123", "Standard", 1, kms,
                new ProjectManager());
        document = new Document("doc123", "proj123", "Document Title");
        project.addDocument(document);
        kms.projects.put(project.getProjectID(), project);
    }

    @Test
    void testAccessProject() {
        Project retrievedProject = kms.accessProject("proj123");
        assertNotNull(retrievedProject, "Project should be retrieved successfully");
    }

    @Test
    void testUpdateDocumentContent() {
        String newContent = "New content for the document";
        kms.updateDocumentContent("proj123", "doc123", newContent);
        assertEquals(newContent, project.getDocument("doc123").getContent(), "Document content should be updated");
    }

    @Test
    void testSendNotification() {
        // Since sendNotification only prints to the console, we're testing if it runs
        // without error
        assertDoesNotThrow(() -> kms.sendNotification("Test Message", employee),
                "sendNotification should not throw an exception");
    }

    @Test
    void testClientRetrievalFromProject() {
        // Check if getClientFromProject correctly retrieves the client for a given
        // project
        User client = kms.getClientFromProject("proj123");
        assertNotNull(client, "Client should be retrieved successfully for the project");
        assertEquals("client123", client.getUserID(), "Client ID should match the expected value");
    }

}
