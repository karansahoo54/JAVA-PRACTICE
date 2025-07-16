import java.util.*;
import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        List<Integer> squares = nums.stream()
                .map(n -> n * n) // transformation
                .collect(Collectors.toList());

        System.out.println("Squares: " + squares); // [1, 4, 9, 16]
    }
}
