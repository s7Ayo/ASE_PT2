package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import com.worksonproject.*;

class DocumentTest {

    private Document document;
    private final String documentID = "doc1";
    private final String projectID = "proj123";
    private final String title = "Test Document";
    private final String initialContent = "Initial Content";
    private final String updatedContent = "Updated Content";

    @BeforeEach
    void setUp() {
        document = new Document(documentID, projectID, title);
    }

    @Test
    void testCreateDocument() {
        document.createDocument(initialContent);
        assertEquals(initialContent, document.getContent(), "Document content should match initial content");
    }

    @Test
    void testEditDocument() {
        document.createDocument(initialContent);
        document.editDocument(updatedContent);
        assertEquals(updatedContent, document.getContent(), "Document content should be updated");
    }

    @Test
    void testDeleteDocument() {
        document.createDocument(initialContent);
        document.deleteDocument();
        assertEquals("", document.getContent(), "Document content should be empty after deletion");
    }

}