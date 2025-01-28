/*
 * Kirjoita peli, jossa tietokone arpoo kokonaisluvun väliltä 1..10. Kone arvuuttelee 
 * lukua pelaajalta siihen asti, kunnes tämä arvaa oikein. 
 * Kunkin arvauksen jälkeen ohjelma tulostaa tekstin Liian suuri arvaus, Liian pieni arvaus tai Oikein. 
 * Huomaa, että tietokone ei saa vaihtaa lukuaan arvauskertojen välissä.
 */

import java.util.Random;
import java.util.Scanner;

public class FourFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        System.out.println("Welcome to the guessing game!");
        //System.out.println("Arvottu luku: " + randomNumber);
        
        while (true) {
            System.out.print("Enter a number (0-10): ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.print("You guessed the correct number!");
                break;
            } else if (playerGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low");
            }

        }

        scanner.close();

    }

}
