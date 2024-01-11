package com.worksonproject;

public abstract class User {
    protected String userID;
    protected String name;
    protected String email;
    protected String password;
    protected boolean isLoggedIn;
    // Constructor
    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void updateProfile();
 

      // Method to set the user as logged in
      public void login() {
        isLoggedIn = true;
    }

    // Method to set the user as logged out
    public void logout() {
        isLoggedIn = false;
    }

    // Getter for isLoggedIn
    public boolean isLoggedIn() {
        return isLoggedIn;
    }


    public void accessProject(String projectID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Getters and setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
