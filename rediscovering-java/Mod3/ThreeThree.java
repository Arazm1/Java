//Kirjoita ohjelma, joka kysyy käyttäjän biologisen sukupuolen ja hemoglobiiniarvon (g/l). Ohjelma ilmoittaa, onko hemoglobiiniarvo alhainen, normaali vai korkea.

//Naisen normaali hemoglobiiniarvo on välillä 117-175 g/l.
//Miehen normaali hemoglobiiniarvo on välillä 134-195 g/l.


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
