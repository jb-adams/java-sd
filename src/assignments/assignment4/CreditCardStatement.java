package assignments.assignment4;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class CreditCardStatement {
    private double balance;
    private String csvFile;
    private ArrayList<String> transactions;

    public CreditCardStatement(String csvFile) {
        this.balance = 0.0;
        this.csvFile = csvFile;
        this.transactions = new ArrayList<String>();
        parseCSV();
    }

    private void parseCSV() {

        try {
            File file = new File(this.csvFile);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String datarow;
            while ((datarow = br.readLine()) != null) {
                this.transactions.add(datarow);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

    }

    public void updateBalance() {

        for (String transaction : this.transactions) {
            String[] fields = transaction.split(",");
            String type = fields[1];
            double amount = Double.parseDouble(fields[3]);

            if (type.equals("CREDIT")) {
                this.balance += amount;
            } else if (type.equals("DEBIT")) {
                this.balance -= amount;
            }
        }

        this.balance = Math.round(this.balance * 100.0) / 100.0;

        if (balance == 0.0) {
            System.out.println("Thank you for your payments.");
        } else if (balance < 0.0) {
            System.out.println("Thank you for your payments.\n" +
                "Your current overpayment is " + Math.abs(this.balance));
        } else if (balance > 0.0) {
            this.balance *= 1.10;

            System.out.println("Warning: you currently have a balance greater than 0.\n" +
                    "A 10% fee has been added to your balance.\n" +
                    "Your new balance after the fee is " + Math.abs(this.balance));
        }
    }
}
