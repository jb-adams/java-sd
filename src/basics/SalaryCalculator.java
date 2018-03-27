package basics;

public class SalaryCalculator {

    public static void main(String[] args) {
        // let's create a variable to define our career

        // Declare a variable
        String career;
        System.out.println("Program is starting.");

        // Define a variable
        career = "Software Developer";
        System.out.println("My career is: " + career);

        //Declare and define a variable in the same line
        // compute our annual salary
        // rate * hoursPerWeek * weeksPerYear
        int hoursPerWeek  = 40;
        int weeksPerYear = 50;
        double rate = 42.50;
        career = "Web Developer";

        double salary = rate * hoursPerWeek * weeksPerYear;
        System.out.println(
            "My salary as a " + career + " at the rate of $" + rate + " is $" + salary + " per year"
        );


    }

}
