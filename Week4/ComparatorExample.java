// Iterator – Traverse elements in a Collection
// import java.util.*;

// public class IteratorExample {
//     public static void main(String[] args) {
//         List<String> fruits = new ArrayList<>();
//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Mango");

//         Iterator<String> it = fruits.iterator();

//         while (it.hasNext()) {
//             System.out.println(it.next());
//         }
//     }
// }







// 2. Comparable – Natural sorting (e.g., by name, ID)
// Use when the class itself defines sorting logic.
/*class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return this.marks - s.marks; // ascending by marks
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aman", 85));
        list.add(new Student("Bina", 92));
        list.add(new Student("Chetan", 78));

        Collections.sort(list); // uses compareTo()

        for (Student s : list) {
            System.out.println(s);
        }
    }
}*/














// Comparator – Custom sorting logic
// Use when you want multiple ways to sort, or don’t want to modify the class.
/*import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aman", 85));
        list.add(new Student("Bina", 92));
        list.add(new Student("Chetan", 78));

        // Sort by name
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("Sorted by name:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}*/
