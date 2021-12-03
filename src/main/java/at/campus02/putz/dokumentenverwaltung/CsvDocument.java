package at.campus02.putz.dokumentenverwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document{

    private ArrayList<String> lines;

    public CsvDocument(String filename) {
        super(filename);
        this.lines = new ArrayList<>();
    }

    @Override
    public void printDocument() {
        System.out.print("(CsvDocument) Filename: " + this.filename + ", Content: ");
        for (String line : lines) {
            System.out.print(line + ", ");
        }
    }

    public void addLine(String line){
        this.lines.add(line);
    }
}
