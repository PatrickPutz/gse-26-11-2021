package at.campus02.putz.dokumentenverwaltung;

import java.util.ArrayList;

public class PrintManager {

    private ArrayList<Document> documents;

    public PrintManager() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document d){
        documents.add(d);
    }

    public void printAll(){
        for (Document document : documents) {
            document.printDocument();
        }
    }

    public Document findDocument(String fileName){
        for (Document document : documents) {
            if(fileName == document.filename)
                return document;
        }
        return null;
    }

}
