//Scanner Functionality
import java.util.Scanner;

public class Introduction3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Add code below:
    System.out.print("What is your name? ");
    String userName = input.next();

    System.out.printf("Hello %s! It's nice to meet you.", userName);
    
    input.close();
  }
}