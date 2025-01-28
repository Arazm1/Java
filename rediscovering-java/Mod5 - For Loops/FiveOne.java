/*
 * Kirjoita ohjelma, joka kysyy käyttäjältä arpakuutioiden lukumäärän. 
 * Ohjelma heittää kerran kaikkia arpakuutioita ja tulostaa silmälukujen summan. 
 * Käytä for-toistorakennetta.
 */


import java.util.Random;
import java.util.Scanner;


public class FiveOne {
  
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Enter a number: ");
    int userValue = scanner.nextInt();

    int sum = 0;

    for (int i = 0; i < userValue; i++) {
      int randomValue = random.nextInt(6) + 1;
      sum += randomValue;

      
    } 
    System.out.println("The sum of the rolled dice is: " + sum); 
    scanner.close();
  }
}