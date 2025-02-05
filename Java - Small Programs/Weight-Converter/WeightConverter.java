import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Kilograms (k) or Pounds (l): ");
        String unit = scanner.next().toLowerCase();

        if (unit.equals("k")) {
            double weightConverted = weight * 2.20462262185; 
            System.out.println(weight + " kg is " + weightConverted + " lbs.");
        } else if (unit.equals("l")) {
            double weightConverted = weight * 0.45359237;
            System.out.println(weight + " Lbs is " + weightConverted + " kg.");
        } else {
            System.out.println(unit + "is not valid unit.");
        }
        scanner.close();
    }
    
}
