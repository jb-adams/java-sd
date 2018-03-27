package oop;

public class BankAccount implements IRate {
    // Define variables
    String accountNumber;

    //static
    //we want the routingNumber to remain consistent across all instantiated BankAccount objects
    //hence, we make it static
    //final
    //final >> constant
    private static final String routingNumber = "013546";

    private String name;
    private String ssn;
    String accountType;
    double balance = 0;

    //Constructor definitions; unique methods
        //1. They are used to define / setup / initialize properties of an object
        //2. Constructors are implicitly called upon instantiation
        //3. The same name as the class itself
        //4. Contructors have no return type

    BankAccount() {
        System.out.println("NEW ACCOUNT CREATED");
    }
    //Overloading: call same method name with different arguments
    BankAccount(String accountType) {
        System.out.println("NEW ACCOUNT CREATED: " + accountType);
    }
    BankAccount(String accountType, double initDeposit) {
        System.out.println("NEW ACCOUNT CREATED: " + accountType);
        System.out.println("INITITAL DEPOSIT OF: $" + initDeposit);
        String msg = null;

        if (initDeposit < 1000.0) {
            msg = "ERROR: Miniumum deposit must be at least $1,000.";
            System.out.println(msg);
        } else {
            msg = "Thanks for your initial deposit of: $" + initDeposit;
        }
        System.out.println(msg);
        balance = balance+initDeposit;

    }

    // Getters / Setters

    //Allow the user to define the name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
    public String getSSN() {
        return this.ssn;
    }

    // Interface methods
    public void setRate() {
        System.out.println("SETTING RATE");
    }
    public void increaseRate() {
        System.out.println("INCREASING RATE");
    }

    //Define methods
    //Access Specifiers
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount) {
        balance = balance - amount;
        showActivity("WITHDRAW");
    }

    // Private : can only be called from within the class
    private void showActivity(String activity) {
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: " + balance);
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);

    }

    protected void getStatus() {

    }

    @Override
    public String toString() {
        return  "[ " + name + ", ACCOUNT#" + accountNumber + ", ROUTING#" + routingNumber + ", BALANCE: $" + balance + " ]";
    }


}
