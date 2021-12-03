package at.campus02.putz.dokumentenverwaltung;

public abstract class Document {

    protected String filename;

    public Document(String filename) {
        this.filename = filename;
    }

    public abstract void printDocument();

}
