package at.campus02.putz.customer;

public class Person {

    private String firstname;
    private String lastname;

    public void printPerson(){
        System.out.println("Name: " + this.firstname + " " + this.lastname);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
