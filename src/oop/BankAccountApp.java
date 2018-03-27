package oop;

public class BankAccountApp {

    public static void main(String[] args) {
        //creating a new bank account >> instantiate an object

        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "01689453";
        // With Encapsulation (public API methods)
        acc1.setName("Roger Hue");
        acc1.setSSN("234823423");
        System.out.println(acc1.getName());
        System.out.println(acc1.getSSN());

        acc1.setRate();
        acc1.increaseRate();

        acc1.balance = 10000;
        System.out.println(acc1.toString());
        // acc1.showActivity(); // access specifier prevents this method from being called
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);

        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "01689453";

        BankAccount acc3 = new BankAccount("Savings Account", 5000);
        acc3.accountNumber = "01689453";
        acc3.checkBalance();

        //System.out.println(acc1.routingNumber);
        //System.out.println(acc2.routingNumber);
        //System.out.println(acc3.routingNumber);

        // Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.setName("Juan");
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());
        cd1.compound();
        cd1.interestRate = "4.5";
    }
}
