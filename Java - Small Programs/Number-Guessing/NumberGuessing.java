import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int randomNumber = random.nextInt(10) + 1;

    int maxTries = 3; //You can change this value to set the maximum number of attempts.
    int tries = 0;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have chosen a number between 1 and 10. Can you guess it?");
    System.out.println("You have " + maxTries + " attempts. Good luck!\n");

    while (tries < maxTries) {
      System.out.println("Enter a number: ");
      int userValue = scanner.nextInt();
      if (userValue > randomNumber) {
        System.out.println("Too high!");
        tries += 1;
      } else if (userValue < randomNumber) {
        System.out.println("Too low!");
        tries += 1;
      } else {
        System.out.println("You have guessed the correct number!");
        break;
      }
    }

    if (tries == maxTries) {
      System.out.println("You have used all your attempts. The correct number was: " + randomNumber);
      System.out.println("Better luck next time!");

    }
    scanner.close();
  }
}
