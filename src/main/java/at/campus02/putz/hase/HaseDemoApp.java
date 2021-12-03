package at.campus02.putz.hase;

public class HaseDemoApp {

    public static void main(String[] args) {

        Hase Gunter = new Hase("Gunter");
        Weihnachtshase Olaf = new Weihnachtshase("Olaf", 9999);
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

        System.out.println("------------------");

        // Up-Casting
        Hase wh = Olaf;
        Hase wh2 = new Weihnachtshase("Christkind", 999);

        wh2.fressen();
        wh2.verteilen();
        wh2.verteilen();

        Hase oh = new Osterhase("Osterhase");

        oh.fressen();
        oh.verteilen();
        // oh.bemaleOstereier(); -> existiert nicht, kann nur auf Methoden zugreifen,
        // die auch beim Hasen existieren. Überschriebene Methoden werden jedoch immer
        // von der konkreteren Klasse genommen

        System.out.println("------------------");

        // Down-Casting
        Osterhase osterHase = (Osterhase) oh;
        osterHase.bemaleOstereier();

        // Osterhase wh2AlsOsterhase = (Osterhase) wh2; -> kann nicht in einen Osterhasen gecastet werden, da er ein Weihnachtshase ist.
        // wh2AlsOsterhase.bemaleOstereier();

    }

}
