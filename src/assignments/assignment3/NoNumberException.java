package assignments.assignment3;

public class NoNumberException extends Exception {
    private String password;

    // Constructor
    public NoNumberException(String password) {
        this.password = password;
    }

    public String toString() {
        return "NoNumberException encountered";
    }

}
