// Parent class
class Parent {
    String parentVariable = "Parent's variable";

    // Constructor
    Parent() {
        System.out.println("Parent's constructor");
    }

    // Method
    void parentMethod() {
        System.out.println("Parent's method");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    String childVariable = "Child's variable";

    // Constructor
    Child() {
        super(); // Calling parent class constructor
        System.out.println("Child's constructor");
    }

    // Method overriding
    @Override
    void parentMethod() {
        super.parentMethod(); // Calling parent class method
        System.out.println("Child's method");
    }

    void accessParentVariable() {
        System.out.println("Parent variable from child: " + super.parentVariable);
    }
}

public class Super {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod(); // Output: Parent's method followed by Child's method
        child.accessParentVariable(); // Output: Parent variable from child: Parent's variable
    }
}
