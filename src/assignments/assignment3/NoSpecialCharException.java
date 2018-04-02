package assignments.assignment3;

public class NoSpecialCharException extends Exception {
    private String password;

    // Constructor
    public NoSpecialCharException(String password) {
        this.password = password;
    }

    public String toString() {
        return "NoSpecialCharException encountered";
    }
}
