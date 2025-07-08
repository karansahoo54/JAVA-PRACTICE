public class Day4_Loops {
    public static void main(String[] args) {
        System.out.println("Numbers 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nReverse a number (1234):");
        int num = 1234, rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed: " + rev);

        System.out.println("Sum of digits (123):");
        int sum = 0, n = 123;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
    }
}

