package com.worksonproject;

public class Notification {
    protected String notificationID;
    protected String content;

    public Notification(String notificationID, String content) {
        this.notificationID = notificationID;
        this.content = content;
    }

    public void sendNotification(String message, User user) {
        // Logic to send notification to the user
        // For example, this could update a notification list, send an email, etc.
        System.out.println("Notification sent to " + user.getName() + ": " + message);
    }

    // Getters and setters can be added here
}
