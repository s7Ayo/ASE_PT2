package com.worksonproject;

public class Client extends User {
    protected String companyName;
    protected String companyInfo;

    // Constructor using 'super' to initialize inherited fields
    public Client(String userID, String name, String email, String password, String companyName, String companyInfo) {
        super(userID, name, email, password);
        this.companyName = companyName;
        this.companyInfo = companyInfo;
    }

    @Override
    public void updateProfile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void accessProject(String projectID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Getters and setters for companyName and companyInfo
    // Other methods...
}
