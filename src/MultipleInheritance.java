
interface A {
    void methodA();
}

// Interface 2
interface B {
    void methodB();
}

// Class implementing both interfaces
class MyClass implements A, B {
    public void methodA() {
        System.out.println("Method A implementation");
    }

    public void methodB() {
        System.out.println("Method B implementation");
    }
}



public class MultipleInheritance {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA(); // Calling methodA from interface A
        obj.methodB(); // Calling methodB from interface B
    }
}
