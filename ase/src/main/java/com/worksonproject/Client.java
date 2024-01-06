package com.worksonproject;

public class Client extends User {
    protected String companyName;
    protected String companyInfo;

    // Constructor
    public Client(String userID, String name, String email, String password, String companyName, String companyInfo) {
        super(userID, name, email, password);
        this.companyName = companyName;
        this.companyInfo = companyInfo;
    }

    // Getters and setters for companyName and companyInfo
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }

    // Implementations of abstract methods from User class
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

    // Client-specific method
    public void accessBiographies() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
