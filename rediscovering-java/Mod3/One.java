import java.util.Scanner;

public class One {
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
