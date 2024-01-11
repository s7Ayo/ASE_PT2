package com.worksonproject;

import java.util.HashSet;
import java.util.Set;

public class Employee extends User {
    protected String accessLevel;
    protected BeenzAccount beenzAccount;
    protected Biography biography;
    protected KMS kms;
    protected ProjectManager projectManager;
    protected Set<String> assignedProjects = new HashSet<>();

    public Employee(String userID, String name, String email, String password, String accessLevel, int biographyID, KMS kms, ProjectManager projectManager) {
        super(userID, name, email, password);
        this.accessLevel = accessLevel;
        this.beenzAccount = new BeenzAccount();
        this.biography = new Biography(biographyID, userID);
        this.kms = kms;
        this.projectManager = projectManager;
    }
    public void workOnProject(String projectID, String documentId, String newContent) {
        if (this.isLoggedIn) {
            // Employee is logged in, proceed with the work on the project
            Command updateCommand = new UpdateDocumentCommand(this.kms, projectID, documentId, newContent);
            this.projectManager.setCommand(updateCommand);
            this.projectManager.executeCommand();
            earnBeenz(10); // Example: Earning beenz points for updating content
        } else {
            // Employee is not logged in, handle this situation appropriately
            // For example, throw an exception or return an error message
            throw new IllegalStateException("Employee must be logged in to work on a project.");
        }
    }

    // Getters and setters for accessLevel, beenzAccount, and biography
    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    public BeenzAccount getBeenzAccount() {
        return beenzAccount;
    }

    public Biography getBiography() {
        return biography;
    }

    // Implementations of abstract methods from User class
    @Override
    public void updateProfile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void assignProject(String projectID) {
        assignedProjects.add(projectID);
    }
 

    @Override
    public void accessProject(String projectID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Employee-specific methods
    public void updateContent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void earnbeenz() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void searchEmployee() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void editDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void submitDocument() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    // Employee-specific methods
    public void updateContent(String projectID, String documentId, String newContent) {
        // Update content logic (e.g., edit project documents)
        workOnProject(projectID, documentId, newContent);
        earnBeenz(10); // Example: Earning beenz points for updating content
    }

    public void earnBeenz(int points) {
        // Add beenz points to account
        this.beenzAccount.addBeenz(points);
    }
  public boolean isAssignedToProject(String projectID) {
        return assignedProjects.contains(projectID);
    }
}
