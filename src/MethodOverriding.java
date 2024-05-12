class Cat {
    void makeSound() {
        System.out.println("Cat noise");
    }
}

// Child class inheriting from Animal
class Kitty extends Cat {
    // Method overriding
    void makeSound() {
        System.out.println("Small kitty noise");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Cat animal = new Cat();
        animal.makeSound(); // Output: Animal makes a generic sound

        Kitty kitty1 = new Kitty();
        kitty1.makeSound(); // Output: Dog barks

        // Upcasting - Reference of parent class pointing to child class object
        Cat anotherDog = new Kitty();
        anotherDog.makeSound(); // Output: Dog barks (runtime polymorphism)
    }
}