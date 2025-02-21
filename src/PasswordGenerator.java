import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many digits do you want to use for a numeric password?");
        int length = scanner.nextInt();        
        System.out.println("Your password is");
        for (int i = 0; i < length; i++) {
            int digit = (int)(Math.random() * 10);
            System.out.print(digit);
        }        
        scanner.close();
    }
}