package assignments.assignment2;

public class Student {

    // Class variables
    private static int ID = 1000;

    // Instance variables
    private String name; // student name
    private String SSN; // student ssn
    private String email; // student's email
    private String userID; // student's unique id
    private double balance = 9000.0; // student's remaining balance for enrollment
    private String phone; // student's phone number
    private String city; // student's city of residence
    private String state; // student's state of residence
    private String[] courseList = new String[4]; // list of courses student is enrolled in (maximum 4)
    private int courseListIdx = 0; // keeps track of which index to add to in the course list

    // Constructor
    public Student(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        setEmail();
        String msg = "New Student ->"
                + " Name: " + this.name
                + " SSN: " + this.SSN
                + " Email: " + this.email;
        System.out.println(msg);
    }

    // Private methods
    private void setEmail() {
        this.email = this.name + "@uwaterloo.ca";
    }

    //Public methods
    public void setUserID() {
        int r1 = (int) (Math.random() * 8000);
        int randomNumber = r1 + 1000;

        String userID = this.ID + "" + randomNumber + this.SSN.substring(5);
        this.userID = userID;
        ID++;

        String msg = "userID set for " + this.name + ": " + this.userID;
        System.out.println(msg);
    }

    public void enroll(String courseName) {
        this.courseList[this.courseListIdx] = courseName;
        this.courseListIdx++;
        System.out.println(this.name + " enrolled in " + courseName);
    }

    public void pay(double amount) {
        this.balance -= amount;
        String msg = this.name + " paid " + amount + " to his/her student account. "
                + "Remaining balance: " + this.balance;
        System.out.println(msg);
    }

    public void checkBalance() {
        String msg = this.name + "'s current balance is: " + this.balance;
        System.out.println(msg);
    }

    public String toString() {
        return "[Student]\n"
                + "[Name: " + this.name + "]\n"
                + "[SSN: " + this.SSN + "]\n"
                + "[Email: " + this.email + "]\n"
                + "[UserID: " + this.userID + "]\n"
                + "[Balance: " + this.balance + "]\n"
                + "[Phone: " + this.phone + "]\n"
                + "[City: " + this.city + "]\n"
                + "[State: " + this.state + "]\n";
    }

    public void showCourses() {
        String msg = this.name + "'s courses are:\n";

        for (int i=0; i<this.courseListIdx; i++) {
            msg += "\t" + this.courseList[i] + "\n";
        }

        System.out.println(msg);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }

}
