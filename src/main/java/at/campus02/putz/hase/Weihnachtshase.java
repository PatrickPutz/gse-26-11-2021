package at.campus02.putz.hase;

// konkretere Version von Hase
public class Weihnachtshase extends Hase{

    private int countGifts;

    public Weihnachtshase(String name, int countGifts) {
        super(name);
        this.countGifts = countGifts;
    }

    public Weihnachtshase(String name) {
        super(name);
        this.countGifts = 1;
    }

    @Override // Annotation
    public void verteilen() {
        // super.verteilen(); -> um die Methode der Basisklasse zu verwenden und erweitern
        System.out.println(this.name + " verteilt die Geschenke unter dem Christbaum. Anzahl Geschenke: " + this.countGifts);
        // System.out.println(super.name + " verteilt die Geschenke unter dem Christbaum."); -> andere Möglichkeit
        countGifts--;
    }
}
