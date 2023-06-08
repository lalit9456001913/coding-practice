// Class representing a Bank
class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class representing a Customer
class Customer {
    private String name;
    private Bank bank; // Association - Customer has a Bank

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public Bank getBank() {
        return bank;
    }
}

// Main class
public class Association {
    public static void main(String[] args) {
        // Create a Bank object
        Bank bank = new Bank("XYZ Bank");

        // Create a Customer object associated with the Bank
        Customer customer = new Customer("John Doe", bank);

        // Access the properties through association
        String customerName = customer.getName();
        Bank customerBank = customer.getBank();
        String bankName = customerBank.getName();

        // Print the details
        System.out.println("Customer: " + customerName);
        System.out.println("Bank: " + bankName);
    }
}
