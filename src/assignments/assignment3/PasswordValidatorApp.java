package assignments.assignment3;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PasswordValidatorApp {

    public static void main(String[] args) {
        String filename = "C:\\Users\\jerem\\Documents\\Assignment3Data.txt";
        File file = new File(filename);
        String[] passwords = new String[14];

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i=0; i<passwords.length; i++) {
                passwords[i] = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename);
        }

        for (int i=0; i<passwords.length; i++) {
            System.out.println("---");
            System.out.println("password is: " + passwords[i]);

            PasswordValidator pw = new PasswordValidator(passwords[i]);
            pw.validatePassword();
            if (pw.getValid()) {
                System.out.println("Valid Password.");
            }
        }
    }
}
