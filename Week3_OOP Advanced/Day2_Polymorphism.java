class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; } // Overloaded
}
class Shape {
    void draw() { System.out.println("Drawing shape"); }
}
class Circle extends Shape {
    void draw() { System.out.println("Drawing circle"); } // Overridden
}
