package at.campus02.putz.dokumentenverwaltung;

public class ImageDocument extends Document{

    private int sizeX;
    private int sizeY;
    private String colour;

    public ImageDocument(String filename, int sizeX, int sizeY, String colour) {
        super(filename);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.colour = colour;
    }

    @Override
    public void printDocument() {
        System.out.println("(ImageDocument) Filename: " + this.filename + ", Size X: " + this.sizeX +
                ", Size Y: " + this.sizeY + ", Colour: " + this.colour);
    }
}
