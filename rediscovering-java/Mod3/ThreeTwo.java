//Kirjoita ohjelma, joka kysyy käyttäjältä laivan hyttiluokan (LUX, A, B, C) ja tulostaa sen sanallisen kuvauksen alla olevan luettelon mukaisesti. Tehtävässä on käytettävä if/elif/else-toistorakennetta.

//LUX on parvekkeellinen hytti yläkannella.
//A on ikkunallinen hytti autokannen yläpuolella.
//B on ikkunaton hytti autokannen yläpuolella.
//C on ikkunaton hytti autokannen alapuolella.

import java.util.Scanner;

public class ThreeTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the cabin class (LUX, A, B, C): ");
        String hytti = scanner.nextLine();

        if (hytti.equalsIgnoreCase("LUX")) {
            System.out.print("LUX on parvekkeellinen hytti yläkannella.");
        } else if (hytti.equalsIgnoreCase("A")) {
            System.out.print("A on ikkunallinen hytti autokannen yläpuolella.");
        } else if (hytti.equalsIgnoreCase("B")) {
            System.out.print("B on ikkunaton hytti autokannen yläpuolella.");
        } else if (hytti.equalsIgnoreCase("C")) {
            System.out.print("C on ikkunaton hytti autokannen alapuolella.");
        } else {
            System.out.print("Virheellinen hyttiluokka.");
        }
        scanner.close();
    }
}
