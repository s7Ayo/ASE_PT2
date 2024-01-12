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

    // Implement a basic method to update client profile
    @Override
    public void updateProfile() {
        // Implement logic for updating client profile
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void accessProject(String projectID) {
        // Logic for clients accessing a project, if different from other users
        throw new UnsupportedOperationException("Not supported yet.");
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

    // Other methods...
}
