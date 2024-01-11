package com.worksonproject;

public class UpdateDocumentCommand implements Command {
    private KMS kms;
    private String projectID;
    private String documentID;
    private String newContent;

    public UpdateDocumentCommand(KMS kms, String projectID, String documentID, String newContent) {
        this.kms = kms;
        this.projectID = projectID;
        this.documentID = documentID;
        this.newContent = newContent;
    }

    @Override
    public void execute() {
        kms.updateDocumentContent(projectID, documentID, newContent);
    }
}
