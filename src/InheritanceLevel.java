// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown in color");
    }
}

public class InheritanceLevel {
    public static void main(String[] args) {
        // Single-level inheritance
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Method defined in Dog class

        System.out.println("---------------------");

        // Multilevel inheritance
        Labrador labrador = new Labrador();
        labrador.eat(); // Inherited method from Animal class
        labrador.bark(); // Inherited method from Dog class
        labrador.color(); // Method defined in Labrador class
    }
}
