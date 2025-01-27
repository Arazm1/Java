//Kirjoita ohjelma, joka kysyy käyttäjältä laivan hyttiluokan (LUX, A, B, C) ja tulostaa sen sanallisen kuvauksen alla olevan luettelon mukaisesti. Tehtävässä on käytettävä if/elif/else-toistorakennetta.

//LUX on parvekkeellinen hytti yläkannella.
//A on ikkunallinen hytti autokannen yläpuolella.
//B on ikkunaton hytti autokannen yläpuolella.
//C on ikkunaton hytti autokannen alapuolella.

import java.util.Scanner;

public class ThreeThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your gender (m/f): ");
        String gender = scanner.nextLine();
        System.out.print("Enter your hemoglobin value (g/l)");
        double value = scanner.nextDouble();

        //Gender M
        if (gender.equalsIgnoreCase("m")) {
            if (value > 195) {
                System.out.print("Hemoglobin value too high.");
            } else if (value < 134 ) {
                System.out.print("Hemoglobin value too low.");
            } else {
                System.out.print("Hemoglobin value is normal.");
            }
            //Gender F
        } else if (gender.equalsIgnoreCase("f")) {
            if (value > 175) {
                System.out.print("Hemoglobin value too high.");
            } else if (value < 117 ) {
                System.out.print("Hemoglobin value too low.");
            } else {
                System.out.print("Hemoglobin value is normal.");
            }
        } else {
            System.out.print("Incorrect input");
        }
        scanner.close();
    }
}
