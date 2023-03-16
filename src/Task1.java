import java.util.ArrayList;

public class Task1 {
    private static ArrayList<Customer> customers;

    public static void main(String[] args) {

        // Initialize ArrayList
        customers = new ArrayList<>();

        // Add customers to ArrayList
        customers.add(new Customer("Valdemar", "Valde"));
        customers.add(new Customer("Sigurd", "Sigge"));
        customers.add(new Customer("Stella", "My"));
        customers.add(new Customer("Johannes", "Johan"));
        customers.add(new Customer("Sigfred", "Fred"));
        customers.add(new Customer("August", "Auge"));

        printCustomers();
    }

    private static void printCustomers() {
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }
}