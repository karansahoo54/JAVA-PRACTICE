public class MyMathUtils {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int power(int base, int exp) {
        int res = 1;
        for (int i = 0; i < exp; i++) res *= base;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("Is 6 even? " + isEven(6));
        System.out.println("2^3 = " + power(2, 3));
    }
}
