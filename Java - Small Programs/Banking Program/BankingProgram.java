import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;

        boolean programIsRunning = true;

        int userChoice;

        System.out.println("Welcome to the Banking Program");
        while (programIsRunning) {

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> 
                showBalance(balance);
                case 2 -> 
                balance += deposit();
                case 3 -> 
                balance -= withdraw(balance);
                case 4 -> {
                    System.out.println("Exiting the Program...");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    programIsRunning = false;
                }
                
                default -> System.out.println("Invalid choice!");
            }

        }

        System.out.println("Thank you for using the Banking Program. Good bye!");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("");
        System.out.printf("%.2f$", balance);
        System.out.println("");
    }

    static double deposit() {

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cant be negative!");
            return 0;
        } else {
            System.out.println("Amount deposited: " + amount + "$");
            return amount;
        }

    }

    static double withdraw(double balance) {

        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        } else {
            System.out.println("Amount withdrawn: " + amount + "$");
            return amount;
        }

    }

}
