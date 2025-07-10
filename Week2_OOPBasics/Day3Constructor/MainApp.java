class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    void show() {
        System.out.println("🚗 Car Brand: " + brand);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        this("Unknown", 0);
    }

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void show() {
        System.out.println("👨‍🎓 Student Name: " + name);
        System.out.println("🆔 Roll No: " + roll);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Car car1 = new Car("Tata");
        car1.show();

        Student s1 = new Student();             // Default
        Student s2 = new Student("Rahul", 101); // Param

        s1.show();
        s2.show();
    }
}
