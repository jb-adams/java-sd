/*
Udemy Junior Java Developer Course Assignment1
*/

package assignments.assignment1;

public class Assignment1 {

    public static int sum(int n) {
        /*
        1. Write a function that takes a value n returns the sum of numbers 1 to n

        params:
            int n: final number in the series
        returns:
            int: the sum of numbers from 1 up to and including n
         */

        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int factorial(int f) {
        /*
        2. Write a factorial that computes the factorial value

        params:
            int f: an integer
        returns:
            int: the factorial value of f
        */

        int factorial;

        if (f == 0) {
            factorial = 1;
        } else {
            factorial = 1;

            for (int i=1; i<=f; i++) {
                factorial *= i;
            }

        }

        return factorial;
    }

    public static int min(int[] intArr) {
        /*
        3. Write a functions that takes an array as a parameter and returns the minumum value

        params:
            int[] intArr: array of integers
        returns:
            int: the smallest value in intArr
        */

        int min = Integer.MAX_VALUE;

        for (int i=0; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }

        return min;
    }

    public static int avg(int[] intArr) {
        /*
        3. Write a function that takes an array as a parameter and returns the average value
        */

        int sum = 0;
        int avg;

        for (int i=0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        avg = sum / intArr.length;
        return avg;
    }

    public static int max(int[] intArr) {
        /*
        3. Write a function that takes an array as a parameter and returns the maximum value

        params:
            int[] intArr: array of integers
        returns:
            int: the maximum values in intArr
        */

        int max = 0;

        for (int i=0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        /*
        test the functions defined above
         */

        //test solution for problem 1
        System.out.println("----------");
        System.out.println("Test solution for problem 1.");
        for (int a=1; a <= 10; a++) {
            System.out.println("input number: " + a + ", value is: " + sum(a));
        }

        //test solution for problem 2
        System.out.println("----------");
        System.out.println("Test solution for problem 2.");
        for (int a=0; a <= 10; a++) {
            System.out.println("input number: " + a + ", value is: " + factorial(a));
        }

        //test solution for problem 3
        System.out.println("----------");
        System.out.println("Test solution for problem 3.");
        System.out.println("---");

        //test on 3 randomly generated arrays of length 10
        for (int a=1; a <= 3; a++) {
            int[] intArr = new int[10];

            //populate array
            System.out.println("Array " + a);
            System.out.print("Array values are: ");
            for (int b=0; b < 10; b++) {
                intArr[b] = (int) Math.round( Math.random() * 50.0 );
                System.out.print(intArr[b] + " ");
            }

            //run functions for problem 3
            int minimum = min(intArr);
            int average = avg(intArr);
            int maximum = max(intArr);

            System.out.println("\nMinimum is: " + minimum);
            System.out.println("Average is: " + average);
            System.out.println("Maximum is: " + maximum);
            System.out.println("---");

        }
    }
}
