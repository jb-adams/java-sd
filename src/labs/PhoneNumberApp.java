package labs;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PhoneNumberApp {

    public static void main(String[] args) {
        // This will read a text file and will retrieve phone number

        String filename = "C:\\Users\\jerem\\Dropbox\\Education\\Programming\\Java\\Courses\\"
                          + "BecomeAJuniorJavaSoftwareDeveloper\\Files\\PhoneNumber.txt";
        String[] phoneNums = new String[9];
        File file = new File(filename);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            for (int i = 0; i < phoneNums.length; i++) {
                phoneNums[i] = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found: " + filename);
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file: " + filename);
        }

        for (int i=0; i<phoneNums.length; i++) {
            String phoneNum = phoneNums[i];
            System.out.println("---");

            // Valid phone number:
            // 10 digits long
            // area code cannot start in 0 or 9
            // there can be no 911 in the phone
            try {
                if (phoneNum.length() != 10) {
                    throw new TenDigitsException(phoneNum);
                }
                if (phoneNum.substring(0,1).equals("0") || phoneNum.substring(0,1).equals("9")) {
                    throw new AreaCodeException(phoneNum);
                }
                if (phoneNum.contains("911")) {
                    throw new EmergencyException(phoneNum);
                }

                System.out.println(phoneNum);
            } catch (TenDigitsException e) {
                System.out.println("ERROR: Phone number is not 10 digits.");
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println("ERROR: Phone number has invalid area code.");
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println("ERROR: Phone number contains 911");
                System.out.println(e.toString());
            }

        }
    }
}

class TenDigitsException extends Exception {
    private String num;

    TenDigitsException(String num) {
        this.num = num;
    }

    public String toString() {
        return "TenDigitsException: " + num;
    }
}

class AreaCodeException extends Exception {
    private String num;

    AreaCodeException(String num) {
        this.num = num;
    }

    public String toString() {
        return "AreaCodeException: " + num;
    }
}

class EmergencyException extends Exception {
    private String num;

    EmergencyException(String num) {
        this.num = num;
    }

    public String toString() {
        return "EmergencyException: " + num;
    }
}
