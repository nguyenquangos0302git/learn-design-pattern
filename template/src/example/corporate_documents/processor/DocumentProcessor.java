package example.corporate_documents.processor;

public abstract class DocumentProcessor {

    public final void processDocument(String pathFile) {
        openFile();
        extractDocData();
        parseDocData();
        analysis();
        if (supportSendReport()) {
            sendReport();
        }
        closeFile();
    }

    private void openFile() {
        System.out.println("open file");
    }

    protected abstract void extractDocData();

    protected abstract void parseDocData();

    private void analysis() {
        System.out.println("analysis");
    }

    private void sendReport() {
        System.out.println("send report");
    }

    private void closeFile() {
        System.out.println("close file");
    }

    protected boolean supportSendReport() {
        return false;
    }

}
