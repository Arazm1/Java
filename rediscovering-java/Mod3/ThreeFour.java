//Kirjoita ohjelma, joka kysyy vuosiluvun ja ilmoittaa, onko annettu vuosi karkausvuosi. 
//Vuosi on karkausvuosi, jos se on jaollinen neljällä. 
//Sadalla jaolliset vuodet ovat karkausvuosia vain jos ne ovat jaollisia myös neljälläsadalla.

import java.util.Scanner;

public class ThreeFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print("The year is leap year.");
        } else {
            System.out.print("The year is not a leap year");
        }
        scanner.close();
    }
}
