package at.campus02.putz.hase;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(this.name + " verteilt die Geschenke unter dem Christbaum.");
    }
}
