package com.worksonproject;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an empty projects map for the KMS implementation
        HashMap<String, Project> projectsMap = new HashMap<>();

        // Create a Client instance
        Client client = new Client("YGOT", "Yoruichi Shihouin", "YGOT@example.com", " Gotei-1323YGOT", " Gotei 13",
                "Corrections Corps Commander,\n" +"Executive Militia Corps Commander");

        // Create and add a project to the map
        String projectID = "project1";
        Project projectToAdd = new Project(projectID, "TradeBot", "This project is about creating an AI-powered trading bot that uses machine learning to analyze financial markets and make autonomous trading decisions for profit maximization and risk minimization.", client);
        projectsMap.put(projectID, projectToAdd);

        // Create a document and add it to the project
        String documentID = "doc1";
        String title = "Project Overview";
        Document documentToAdd = new Document(documentID, projectID, title);
        projectToAdd.addDocument(documentToAdd);

        // Initialize KMS with the projects map
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
        employee.assignProject(projectID);

        // Login check
        if (!employee.isLoggedIn()) {
            System.out.println("Employee must be logged in to continue.");
            return;
        }

        // Project assignment check
        if (!employee.isAssignedToProject(projectID)) {
            System.out.println("Employee is not assigned to this project.");
            return;
        }

        // Accessing the project
        Project project = kms.accessProject(projectID);
        if (project == null) {
            System.out.println("Project not found.");
            return;
        }

        // Retrieve and display the content of the document before updating
        Document doc = project.getDocument(documentID);
        if (doc != null) {
            System.out.println("Before update, document content: " + doc.getContent());
            System.out.println("Last updated time: " + doc.getLastUpdated());
        } else {
            System.out.println("Document not found.");
            return;
        }

        // Employee works on a project's document
        String newContent = "Gotei 13 Trading Bots are advanced AI systems designed for financial market trading, using predictive algorithms to analyze market trends and execute trades at optimal times. They operate continuously, capitalizing on opportunities from market openings across different time zones. These bots aim to maximize returns and minimize risks by adapting to changing market conditions in real-time.";

        // Updating the document content
        project.updateDocumentContent(documentID, newContent);

        // Utilizing ProjectManager to execute document update command
        Command updateCommand = new UpdateDocumentCommand(kms, projectID, documentID, newContent);
        projectManager.setCommand(updateCommand);
        projectManager.executeCommand();

        // Retrieve and display the content of the document after updating
        System.out.println("After update, document content: " + doc.getContent());
        System.out.println("Last updated time: " + doc.getLastUpdated());

        // Dispatch notifications to relevant users
        String notificationContent = "Updated document in project: " + projectID;
        kms.sendNotificationsToEmployeeAndClient(notificationContent, employee, projectID);

        int addedPoints = 10;
        employee.earnBeenz(addedPoints);

        // Print the total points the employee has
        System.out.println("Employee " + employee.getName() + " has " + employee.getBeenzAccount().getBeenzPoints()
                + " beenz points.");
    }

    private static Employee authenticateEmployee(String employeeID, String password, KMS kms) {
        // Placeholder for actual authentication
        Employee employee = new Employee(employeeID, "Simon(Ayo) Kojo", "SAYO@example.com", password, "High", 1, kms,
                null);
        employee.login(); // Ensure employee is logged in
        return employee;
    }
}
