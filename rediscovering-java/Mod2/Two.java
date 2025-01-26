import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Anna ympyrän säteen: ");
        double sade = scanner.nextDouble();

        double pinta_ala = sade * sade * Math.PI;

        System.out.println("Ympyrän pinta-ala on " + pinta_ala + "cm.");
        scanner.close();
    }
}
