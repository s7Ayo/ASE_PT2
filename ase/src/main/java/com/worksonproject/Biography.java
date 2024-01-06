package com.worksonproject;

import java.time.LocalDateTime;

public class Biography {
    private int biographyID;
    private String userID;
    private String content;
    private LocalDateTime lastUpdated;

    public Biography(int biographyID, String userID) {
        this.biographyID = biographyID;
        this.userID = userID;
        this.content = ""; // Default content
        this.lastUpdated = LocalDateTime.now();
    }

    // Create a new biography
    public void createBiography(String content) {
        this.content = content;
        updateLastUpdated();
    }

    // Edit the existing biography
    public void editBiography(String newContent) {
        this.content = newContent;
        updateLastUpdated();
    }

    // Delete the biography content
    public void deleteBiography() {
        this.content = "";
        updateLastUpdated();
    }

    // Get the biography content
    public String getBiography() {
        return content;
    }

    // Set new content for the biography
    public void setBiography(String content) {
        this.content = content;
        updateLastUpdated();
    }

    // Get the last updated time
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    // Update the last updated time
    private void updateLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters and setters for biographyID and userID
    public int getBiographyID() {
        return biographyID;
    }

    public void setBiographyID(int biographyID) {
        this.biographyID = biographyID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
