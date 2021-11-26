package at.campus02.putz.hase;

public class HaseDemoApp {

    public static void main(String[] args) {

        Hase Gunter = new Hase("Gunter");
        Weihnachtshase Olaf = new Weihnachtshase("Olaf");
        Osterhase Rudi = new Osterhase("Rudi");

        Gunter.schlafen();
        Gunter.hoppeln();
        Gunter.fressen();
        Gunter.verteilen();

        System.out.println("------------------");

        Olaf.schlafen();
        Olaf.hoppeln();
        Olaf.fressen();
        Olaf.verteilen();

        System.out.println("------------------");

        Rudi.schlafen();
        Rudi.hoppeln();
        Rudi.fressen();
        Rudi.verteilen();

    }

}
