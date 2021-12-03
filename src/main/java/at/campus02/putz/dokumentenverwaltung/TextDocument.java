package at.campus02.putz.dokumentenverwaltung;

public class TextDocument extends Document{

    private String content;

    public TextDocument(String filename, String content) {
        super(filename);
        this.content = content;
    }

    @Override
    public void printDocument() {
        System.out.println("(TextDocument) Filename: " + this.filename + ", Content: " + this.content);
    }
}
