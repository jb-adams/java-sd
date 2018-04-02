package exceptionsfiles;

public class Demo {

    public static void main(String[] args) {
        doMath(12, 0);
    }

    public static void doMath(int a, int b) {
        answer(a, b);
    }

    public static double answer(int x, int y) {
        // Error is generated here, so we want to catch the error here
        return x/y;
    }
}
