
package Project_Java;

/**
 *
 * @author Zaid.K
 */
public class Implement_an_Interface {
    interface Printable {
    void printDetails();
}

class Ticket implements Printable {
    private String ticketID;
    private double price;

    public Ticket(String ticketID, double price) {
        this.ticketID = ticketID;
        this.price = price;
    }

    @Override
    public void printDetails() {
        System.out.println("Ticket ID: " + ticketID + ", Price: " + price);
    }
}

}
