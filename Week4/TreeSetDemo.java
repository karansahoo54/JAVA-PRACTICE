/*Set<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Apple"); // won't be added*/
/*| Feature   | HashSet           | TreeSet               |
| --------- | ----------------- | --------------------- |
| Order     | No order          | Sorted order          |
| Duplicate | Not allowed       | Not allowed           |
| Nulls     | Allows one `null` | No nulls (in TreeSet) |*/
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(2);  // Duplicate, ignored

        System.out.println("TreeSet: " + numbers); // Output: [2, 5, 8]
    }
}
