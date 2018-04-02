package assignments.assignment3;

public class NoLetterException extends Exception {
    private String password;

    // Constructor
    public NoLetterException(String password) {
        this.password = password;
    }

    public String toString() {
        return "NoLetterException encountered";
    }
}
