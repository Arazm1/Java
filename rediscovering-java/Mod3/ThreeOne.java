//Kirjoita ohjelma, joka kysyy kalastajalta kuhan pituuden senttimetreinä. 
//Jos kuha on alamittainen, ohjelma käskee laskea kuhan takaisin järveen ilmoittaen samalla käyttäjälle, 
//montako senttiä alimmasta sallitusta pyyntimitasta puuttuu. Kuha on alamittainen, jos sen pituus on alle 37 cm.


import java.util.Scanner;

public class ThreeOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter fish length (cm): ");
        double length = scanner.nextDouble();

        int allowed = 37;

        if (length >= 37) {
            System.out.print("It's aight");
        } else {
            double required = allowed - length;
            System.out.print("The fish is undersized by " + required + "cm");
        }
        scanner.close();
    }
}
