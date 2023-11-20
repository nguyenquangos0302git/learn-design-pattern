package example.corporate_documents;

import example.corporate_documents.processor.CSVDocumentProcessor;
import example.corporate_documents.processor.DocDocumentProcessor;
import example.corporate_documents.processor.DocumentProcessor;
import example.corporate_documents.processor.PDFDocumentProcessor;

public class Main {

    public static void main(String[] args) {
        DocumentProcessor documentProcessor = getInstance("CSV");
        documentProcessor.processDocument("pathFile");
    }

    private static DocumentProcessor getInstance(String type) {
        if ("Doc".equalsIgnoreCase(type)) {
            return new DocDocumentProcessor();
        }
        if ("CSV".equalsIgnoreCase(type)) {
            return new CSVDocumentProcessor();
        }
        if ("PDF".equalsIgnoreCase(type)) {
            return new PDFDocumentProcessor();
        }

        return null;
    }

}
