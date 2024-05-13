
import java.io.IOException;



public class ThrowExample {

    // Method that throws an exception
    public static void exampleMethod(int number) throws IOException {
        if (number < 0) {
            throw new IOException("Number cannot be negative.");
        }
        System.out.println("Number is: " + number);
    }

    public static void main(String[] args) {
        try {
            // Calling the method that throws an exception
            exampleMethod(10);
        } catch (IOException e) {
            // Catching the exception
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
