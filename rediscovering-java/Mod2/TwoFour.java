import java.util.Scanner;

public class TwoFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double third = scanner.nextDouble();

        double sum = first + second + third;
        double product = first * second * third;
        double average = sum / 3;

        System.out.println("Sum is " + sum + ".");
        System.out.println("product is " + product + ".");
        System.out.println("Average is " + average + ".");
        scanner.close();
    }
}
