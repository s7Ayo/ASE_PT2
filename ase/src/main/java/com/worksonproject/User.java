package com.worksonproject;

public abstract class User {
    protected String userID;
    protected String name;
    protected String email;
    protected String password;

    // Constructor
    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    // Abstract methods
    public abstract void updateProfile();
    public abstract void login();
    public abstract void logout();
    public abstract void accessProject(String projectID);



    
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


    // Override toString for better readability
    @Override
    public String toString() {
        return "User{" +
               "userID='" + userID + '\'' +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
}
