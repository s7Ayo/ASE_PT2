package com.worksonproject;

import java.util.Map;

public interface KMS {
    void assignProject(Employee employee, Project project);
    void sendNotification(String message, User user);
    void manageBeenz(Employee employee, int points);
    void requestEditDocument(Employee employee, Document document);
    void submitDocument(Employee employee, Document document);
    void updateContent(Employee employee, Document document, String newContent);
    Document viewDocument(String documentId);
    String documentDetails(Document document);
    void earnBeenz(Employee employee, int points);
    void editDocument(Employee employee, Document document, String newContent);
    String accessBiographies();
    Employee searchEmployee(String employeeId);
    void updateEmployeeProfile(Employee employee);
    void createAndSendNotification(String notificationID, String content, User recipient);
    void updateDocumentContent(String projectID, String documentId, String newContent);
    void registerEmployee(Employee employee);
    Project accessProject(String projectID);
    void updateProject(Project project);
    void sendNotificationsToEmployeeAndClient(String message, Employee employee, String projectID);
    void addBeenzToEmployee(Employee employee, int points);
    boolean redeemBeenzFromEmployee(Employee employee, int points);
    void login(User user, String password);
    void logout(User user);
}

