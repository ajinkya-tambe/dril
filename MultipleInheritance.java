import java.util.*;

interface Account {
    void set(String name, long accountNumber, double balance);
    void display();
}

interface Person {
    void store(String address);
    void disp();
}

class Customer implements Person, Account {
    private String name;
    private long accountNumber;
    private double balance;
    private String address;
    
    public void set(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void display() {
        System.out.println("\n\nAccount Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs " + balance);
    }
    
    public void store(String address) {
        this.address = address;
    }
    
    public void disp() {
        System.out.println("Personal Information:");
        System.out.println("Address: " + address);
    }
    
    public void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        //balance += interest;
        System.out.println("Interest: Rs " + interest);
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
	
	  System.out.println("Enter your account info: ");
	  System.out.print("Enter your name: ");
	  String name = sc.nextLine();
	  
	  System.out.print("Enter account number: ");
	  long acc = sc.nextLong();

	  System.out.print("Enter balance: ");
	  double bal = sc.nextFloat();

	  sc.nextLine();

        customer.set(name, acc, bal);

	  System.out.print("Enter your address: ");
	  String adr = sc.nextLine();
	
	  customer.store(adr);
        customer.display();
        customer.calculateInterest(5.0);
       // customer.display();
        customer.disp();
    }
}
