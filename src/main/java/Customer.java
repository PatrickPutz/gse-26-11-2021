import java.util.ArrayList;

public class Customer {

    private int customerNumber;
    private ArrayList<Address> addresses;

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        addresses = new ArrayList<Address>();
    }

    public void addAddress(Address a){
        this.addresses.add(a);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNumber=" + customerNumber +
                ", Addresses=" + addresses +
                '}';
    }
}
