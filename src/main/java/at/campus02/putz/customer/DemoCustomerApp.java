package at.campus02.putz.customer;

public class DemoCustomerApp {

    public static void main(String[] args) {

        Customer Putzi = new Customer(1);
        Customer Leo = new Customer(2);

        Putzi.firstname = "Patrick";
        Putzi.lastname = "Putz";

        Leo.firstname = "Leo";
        Leo.lastname = "Tanner";

        Putzi.addAddress(new Address("Weizerstrasse 1", "8010", "Graz", "Austria"));
        Leo.addAddress(new Address("Bachgasse 7a", "8020", "Graz", "Austria"));
        Putzi.addAddress(new Address("Siebengasse 8a", "1010", "Wien", "Austria"));

        System.out.println("Putzi: " + Putzi.toString());
        System.out.println("Leo: " + Leo.toString());

        Putzi.printPerson();
        Leo.printPerson();

    }

}
