class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Default constructor");
    }

    Student(String n, int r) {
        name = n;
        roll = r;
    }
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student();           // calls default
        Student s2 = new Student("Rahul", 101); // calls parameterized
        s2.show(); // Output: Name: Rahul, Roll: 101
    }
}

