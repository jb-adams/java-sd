package labs;

public class FibonacciApp {

    public static void main(String[] args) {
        //Fibonacci number is defined by the sum of the 2 previous Fibonacci numbers
        // fib(0) = 0
        // fib(1) = 1
        // fib(2) = fib(1) + fib(0) = 0 + 1 = 1
        // fib(3) = fib(2) + fib(1) = 1 + 1 = 2
        // fib(4) = fib(3) + fib(2) = 2 + 1 = 3
        // fib(5) = fib(4) + fib(3) = 3 + 2 = 5

        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        int fibNumber;

        if (n == 0) {
            fibNumber = 0;
        } else if (n == 1) {
            fibNumber = 1;
        } else {
            fibNumber = fib(n-1) + fib(n-2);
        }

        return fibNumber;
    }
}
