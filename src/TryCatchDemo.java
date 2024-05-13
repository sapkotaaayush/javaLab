import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your fac Number? ");

        try{
            int n = scan.nextInt();
            System.out.println(n);
        }
        catch (Exception e){
            System.out.println("Please Enter a valid number...");
        }
    }
}
