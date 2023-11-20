package example.corporate_documents.processor;

public class CSVDocumentProcessor extends DocumentProcessor {
    @Override
    public void extractDocData() {
        System.out.println("extract doc data");
    }

    @Override
    public void parseDocData() {
        System.out.println("parse doc data");
    }
}
