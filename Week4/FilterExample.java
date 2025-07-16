import java.util.*;
import java.util.stream.*;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNums = nums.stream()
                .filter(n -> n % 2 == 0) // condition
                .collect(Collectors.toList());// to convert the stream result back to a List.

        System.out.println("Even numbers: " + evenNums); // [2, 4, 6]
    }
}
