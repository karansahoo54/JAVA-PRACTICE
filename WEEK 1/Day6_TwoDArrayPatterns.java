public class Day6_TwoDArrayPatterns {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Matrix[0][1]: " + matrix[0][1]);

        System.out.println("Triangle Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("** ");
            }
            System.out.println();
        }
    }
}
