import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.println("This program will add all the numbers from 1 to the number you enter");
        System.out.println("Please enter a number");        
        int num = scanner.nextInt();
        System.out.println("You entered " + num);
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }     
        System.out.println("The sum of all numbers from 1 to " + num + " is " + sum);        
        scanner.close();
    }
}