package theater;

/**
 * Class representing an invoice containing a customer and their performances.
 */
public class Invoice {

    private final String customer;
    private final java.util.List<Performance> performances;

    public Invoice(String customer, java.util.List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    public String getCustomer() {
        return customer;
    }

    public java.util.List<Performance> getPerformances() {
        return performances;
    }
}