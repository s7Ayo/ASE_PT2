package com.worksonproject;

import java.util.HashMap;
import java.util.Map;

public class KMSImplementation implements KMS {
    protected Map<String, Project> projects;

    public KMSImplementation() {
        this.projects = new HashMap<>();
    }

    public KMSImplementation(Map<String, Project> projects) {
        this.projects = projects;
    }

    @Override
    public void registerEmployee(Employee employee) {
        // Placeholder implementation
        throw new UnsupportedOperationException("Method not implemented yet.");
    }

    @Override
    public void assignProject(Employee employee, Project project) {
        // Placeholder implementation
        throw new UnsupportedOperationException("Method not implemented yet.");
    }

    @Override
    public void updateProject(Project project) {
        if (project != null && projects.containsKey(project.getProjectID())) {
            projects.put(project.getProjectID(), project);
        } else {
            System.out.println("Project with ID " + project.getProjectID() + " not found or project is null.");
        }
    }

    @Override
    public void updateDocumentContent(String projectID, String documentId, String newContent) {
        Project project = projects.get(projectID);
        if (project != null) {
            project.updateDocumentContent(documentId, newContent);  
        } else {
            System.out.println("Project with ID " + projectID + " not found.");
        }
    }

    @Override
    public void editDocument(Employee employee, Document document, String newContent) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public Project accessProject(String projectId) {
        return projects.get(projectId);
    }

    @Override
    public String accessBiographies() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public Employee searchEmployee(String employeeId) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void updateEmployeeProfile(Employee employee) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void addBeenzToEmployee(Employee employee, int points) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public boolean redeemBeenzFromEmployee(Employee employee, int points) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void createAndSendNotification(String notificationID, String content, User recipient) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void login(User user, String password) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void logout(User user) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public String documentDetails(Document document) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void earnBeenz(Employee employee, int points) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void submitDocument(Employee employee, Document document) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public

void sendNotification(String message, User user) {
// Logic to send notification to the user
System.out.println("Notification sent to " + user.getName() + ": " + message);
}

@Override
public void sendNotificationsToEmployeeAndClient(String message, Employee employee, String projectId) {
    // Send notification to the employee
    sendNotification(message, employee);

    // Retrieve client information based on projectId and send notification
    User client = getClientFromProject(projectId);
    if (client != null) {
        sendNotification(message, client);
    } else {
        System.out.println("Client for project " + projectId + " not found.");
    }
}

private User getClientFromProject(String projectId) {
    Project project = projects.get(projectId);
    if (project != null) {
        return project.getClient();
    }
    return null; // Client not found or project does not exist
}

@Override
public void manageBeenz(Employee employee, int points) {
    // Placeholder
    throw new UnsupportedOperationException("Not implemented yet.");
}

@Override
public void requestEditDocument(Employee employee, Document document) {
    // Placeholder
    throw new UnsupportedOperationException("Not implemented yet.");
}

@Override
public void updateContent(Employee employee, Document document, String newContent) {
    // Placeholder
    throw new UnsupportedOperationException("Not implemented yet.");
}

@Override
public Document viewDocument(String documentId) {
    // Placeholder
    throw new UnsupportedOperationException("Not implemented yet.");
}

}