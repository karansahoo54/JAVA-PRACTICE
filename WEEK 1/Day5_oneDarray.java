public class Day5_oneDarray {
    public static void main(String[] args) {
        int[] marks = {90, 85, 88};

        System.out.println("Second mark: " + marks[1]);

        // Find max
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) max = mark;
        }
        System.out.println("Max: " + max);

        // Find sum
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("Total: " + sum);
    }
}
