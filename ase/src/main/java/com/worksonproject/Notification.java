package com.worksonproject;

public class Notification {
    protected String notificationID;
    protected String content;

    public Notification(String notificationID, String content) {
        this.notificationID = notificationID;
        this.content = content;
    }

    public void sendNotification() {
        // Implementation of notification sending logic
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Getters and setters can be added here
}
