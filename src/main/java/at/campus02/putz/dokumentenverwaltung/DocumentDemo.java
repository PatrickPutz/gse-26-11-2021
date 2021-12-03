package at.campus02.putz.dokumentenverwaltung;

public class DocumentDemo {

    public static void main(String[] args) {

        ImageDocument picture = new ImageDocument("picture.png", 800, 600, "blue");
        picture.printDocument();

        TextDocument textDocument = new TextDocument("text.txt", "Lorem Ipsum...");
        textDocument.printDocument();

        PrintManager pm = new PrintManager();
        pm.addDocument(picture);
        pm.addDocument(textDocument);

        System.out.println("Print All");
        pm.printAll();
    }

}
