abstract class Animal {
    abstract void makeSound();
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
interface Flyable {
    void fly();
}
class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flies");
    }
}
