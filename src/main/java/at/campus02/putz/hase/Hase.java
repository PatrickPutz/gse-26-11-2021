package at.campus02.putz.hase;

public class Hase {

    protected String name;

    public Hase(String name) {
        this.name = name;
    }

    public void schlafen(){
        System.out.println(this.name + " schläft.");
    }

    public void hoppeln(){
        System.out.println(this.name + " hoppelt.");
    }

    public void fressen(){
        System.out.println(this.name + " frisst.");
    }

    public void verteilen(){
        System.out.println(this.name + " ist ein Hase und verteilt nichts.");
    }
}
