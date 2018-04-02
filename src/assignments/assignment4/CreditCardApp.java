package assignments.assignment4;

public class CreditCardApp {

    public static void main(String[] args) {
        String csvFile1 = "C:\\Users\\jerem\\Documents\\Assignment4Data1.csv";
        String csvFile2 = "C:\\Users\\jerem\\Documents\\Assignment4Data2.csv";
        String csvFile3 = "C:\\Users\\jerem\\Documents\\Assignment4Data3.csv";

        CreditCardStatement ccs1 = new CreditCardStatement(csvFile1);
        CreditCardStatement ccs2 = new CreditCardStatement(csvFile2);
        CreditCardStatement ccs3 = new CreditCardStatement(csvFile3);

        System.out.println("---");
        ccs1.updateBalance();
        System.out.println("---");
        ccs2.updateBalance();
        System.out.println("---");
        ccs3.updateBalance();
    }
}
