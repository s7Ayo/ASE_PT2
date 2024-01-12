package com.worksonproject;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an empty projects map for the KMS implementation
        HashMap<String, Project> projectsMap = new HashMap<>();

        // Create a KMSImplementation instance with the projects map
         KMSImplementation kms = new KMSImplementation(projectsMap);

        // Create a ProjectManager instance
        ProjectManager projectManager = new ProjectManager();

        // Authentication and employee login
        Employee employee = authenticateEmployee("employeeID", "password", kms);
        if (employee == null) {
            System.out.println("Authentication failed.");
            return;
        }

        // Assign a project to an employee
        employee.assignProject("project1");

        if (!employee.isLoggedIn()) {
            System.out.println("Employee must be logged in to continue.");
            return;
        }

        String projectID = "project1";
        if (!employee.isAssignedToProject(projectID)) {
            System.out.println("Employee is not assigned to this project.");
            return;
        }

        Project project = kms.accessProject(projectID);
        if (project == null) {
            System.out.println("Project not found.");
            return;
        }

        // Employee works on a project's document
        String documentID = "doc1";
        String newContent = "Updated content for the document.";
        
        // Utilizing ProjectManager to execute document update command
        Command updateCommand = new UpdateDocumentCommand(kms, projectID, documentID, newContent);
        projectManager.setCommand(updateCommand);
        projectManager.executeCommand();

        // Record contributions in the KMS
        kms.updateProject(project);

        // Dispatch notifications to relevant users
        String notificationContent = "Updated project: " + projectID;
        kms.sendNotification(notificationContent, employee);

        int addedPoints = 10; // Static points for each contribution
        employee.earnBeenz(addedPoints);
    }

    private static Employee authenticateEmployee(String employeeID, String password, KMS kms) {
        // Placeholder for actual authentication
        return new Employee(employeeID, "John Doe", "john@example.com", password, "AccessLevel", 1, kms, null);
    }
}
