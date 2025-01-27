//Kirjoita ohjelma, joka muuntaa tuumia senttimetreiksi niin kauan kunnes käyttäjä antaa negatiivisen tuumamäärän. 
//Sen jälkeen ohjelma lopettaa toimintansa. 1 tuuma = 2,54 cm

import java.util.Scanner;

public class FourTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            Double num = scanner.nextDouble();

            if (num <= 0) {
                System.out.println("Invalid input!");
                break;
            }

            double num_converted = num * 2.54;
            System.out.println(num + " cm is " + num_converted + " inch.");
        }
        scanner.close();
        }
    }
