import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 0, 1, or 2");
        System.out.println("scissors (0), rock (1), paper (2): ");
        int human = scanner.nextInt(); 
        int computer = (int)(Math.random() * 3);   
        if (human == computer) {
            System.out.println("Tie");
        }        
        else if (human == 0 && computer == 1) {
            System.out.println("You lose: rock beats scissors");
        }
        else if (human == 0 && computer == 2) {
            System.out.println("You won: scissors beats paper");
        }
        else if (human == 1 && computer == 0) {
            System.out.println("You won: rock beats scissors");
        }
        else if (human == 1 && computer == 2) {
            System.out.println("You lose: paper beats rock");
        }
        else if (human == 2 && computer == 0) {
            System.out.println("You lose: scissors beats paper");
        }
        else if (human == 2 && computer == 1) {
            System.out.println("You won: paper beats rock");
        }
        
        scanner.close();
    }
}