
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("nabilsibasuki", "tambelang");

        // Create an item
        Item BMW = new Item("MobilBMW");

        // Order Date
        @SuppressWarnings("unused")
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date orderDate = new Date();

        // Create an order
        Order order = new Order(BMW, orderDate, "Online");

        // Payments
        Payment cashPayment = new Cash(5000000000L);
        Payment checkPayment = new Check(5000000000L, "****17");
        Payment creditPayment = new Credit(5000000000L, "2024-12-04");

        // Output
        System.out.println("Customer\n" + customer);
        System.out.println("\nOrder\n" + order);
        System.out.println("\nPayments");
        System.out.println(cashPayment);
        System.out.println(checkPayment);
        System.out.println(creditPayment);
    }
}
