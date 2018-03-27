package oop;

public class AccountApp {

    public static void main(String[] args) {
        LoanAccount la = new LoanAccount();
        la.setRate();
        la.setAmortSchedule();
        la.setTerm(20);

        IRate account1 = new LoanAccount();
        account1.setRate();
    }
}
