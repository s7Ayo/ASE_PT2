package com.worksonproject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class KMSImplementationTest {

    private KMSImplementation kms;
    private Project project;
    private Employee employee;

    @BeforeEach
    void setUp() {
        // Setup KMS with a project and an employee
        kms = new KMSImplementation();
        project = new Project("proj123", "AI Project", "A project description", new Client());
        employee = new Employee("emp123", "John Doe", "john@example.com", "securepassword", "Developer", 42, kms, new ProjectManager());

        // Add a project to the KMS
        kms.projects.put(project.getProjectID(), project);
    }

    @Test
    void testAccessProject() {
        // Test accessing a project from KMS
        Project accessedProject = kms.accessProject("proj123");
        assertNotNull(accessedProject, "Accessing project should return a non-null Project object.");
        assertEquals(project, accessedProject, "The accessed project should be the same as the one added.");
    }

    @Test
    void testUpdateProject() {
        // Test updating a project in KMS
        String newDescription = "Updated project description";
        project.setDescription(newDescription);
        kms.updateProject(project);
        assertEquals(newDescription, kms.accessProject("proj123").getDescription(), "Project description should be updated in the KMS.");
    }

    @Test
    void testUpdateDocumentContent() {
        // Test updating document content within a project in KMS
        Document document = new Document("doc123", "proj123", "Document Title");
        project.addDocument(document);
        String newContent = "Updated document content";
        kms.updateDocumentContent("proj123", "doc123", newContent);
        assertEquals(newContent, project.getDocument("doc123").getContent(), "Document content should be updated in the project.");
    }

    @Test
    void testSendNotification() {
        // Test sending notifications from KMS
        String message = "Test notification";
        assertDoesNotThrow(() -> kms.sendNotification(message, employee), "Sending notification should not throw an exception.");
    }

    @Test
    void testAssignProjectToEmployee() {
        // Test assigning a project to an employee
        employee.assignProject(project.getProjectID());
        assertTrue(employee.isAssignedToProject(project.getProjectID()), "Project should be assigned to the employee.");
        // Further tests would be needed if the project tracked assigned employees
    }

    @Test
    void testEmployeeLoginFunctionality() {
        // Test employee login functionality
        employee.login();
        assertTrue(employee.isLoggedIn(), "Employee should be logged in.");
    }

    @AfterEach
    void tearDown() {
        // Clean up or reset resources if necessary
    }
}
