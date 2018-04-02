package assignments.assignment3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator{
    private String password;
    private Boolean valid = false;

    // Constructor
    public PasswordValidator(String password) {
        this.password = password;
    }

    private boolean findNumber() {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(password);
        return m.find();
    }
    private boolean findLetter() {
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(password);
        return m.find();
    }
    private boolean findSpecialChar() {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher(password);
        return m.find();
    }

    public void validatePassword() {

        try {
            if (!findNumber()) {
                throw new NoNumberException(password);
            }
            if (!findLetter()) {
                throw new NoLetterException(password);
            }
            if (!findSpecialChar()) {
                throw new NoSpecialCharException(password);
            }

            valid = true;

        } catch (NoNumberException e) {
            System.out.println(e.toString());
            System.out.println("Invalid password: no number found: " + this.password);
        } catch (NoLetterException e) {
            System.out.println(e.toString());
            System.out.println("Invalid password: no letter found: " + this.password);
        } catch (NoSpecialCharException e) {
            System.out.println(e.toString());
            System.out.println("Invalid password: no special character found: " + this.password);
        }
    }

    // Getters
    public String getPassword() {
        return this.password;
    }
    public Boolean getValid() {
        return this.valid;
    }
}
