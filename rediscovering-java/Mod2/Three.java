import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Anna kanta: ");
        double kanta = scanner.nextDouble();

        System.out.print("Anna korkeus: ");
        double korkeus = scanner.nextDouble();

        double piiri = kanta + kanta + korkeus + korkeus;
        double pinta_ala = kanta * korkeus;

        System.out.println("Suorakulmion piiri on " + piiri + "cm.");
        System.out.println("Suorakulmion pinta-ala on " + pinta_ala + "cm.");
        scanner.close();
    }
}
