import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 100);
        map.put("Banana", 60);
        map.put("Mango", 120);
        map.put("Banana", 80); // Updates value

        // Print map
        System.out.println("HashMap: " + map);

        // Get value
        System.out.println("🍌 Banana price: " + map.get("Banana"));

        // Check key
        System.out.println("Contains Mango? " + map.containsKey("Mango"));
    }
}
// import java.util.TreeMap;

// public class TreeMapExample {
//     public static void main(String[] args) {
//         TreeMap<String, Integer> map = new TreeMap<>();

//         map.put("Banana", 80);
//         map.put("Apple", 100);
//         map.put("Mango", 120);

//         // Sorted output
//         System.out.println("TreeMap (Sorted): " + map);
//     }
// }
