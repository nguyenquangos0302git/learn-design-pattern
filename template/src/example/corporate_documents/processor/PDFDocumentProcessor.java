package example.corporate_documents.processor;

import example.corporate_documents.processor.DocumentProcessor;

public class PDFDocumentProcessor extends DocumentProcessor {
    @Override
    public void extractDocData() {
        System.out.println("extract doc data");
    }

    @Override
    public void parseDocData() {
        System.out.println("parse doc data");
    }

    @Override
    protected boolean supportSendReport() {
        return true;
    }
}
