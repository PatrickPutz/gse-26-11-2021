package at.campus02.putz.hase;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(this.name + " versteckt Geschenke und Ostereier.");
    }

    public void bemaleOstereier(){
        System.out.println(this.name + " bemalt die Ostereier");
    }
}
