import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    static void loginUsername() { 
        String username = "";

        while (username.equals("")) {
            try {
                System.out.print("Enter a username: ");
                username = scanner.nextLine();

                if (username.equals("")) {
                    System.out.println("You must enter a username!");
                } else {
                    System.out.println("Username selected: " + username);
                    loginPassword();
                }
            } catch (Exception e) {
                System.out.println("Error. Please try again");

            }

        }
        scanner.close();
    }

    static String loginPassword() {
        
        String password;

        while (true) {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();

            if (password.isEmpty() || password.length() <= 3) {
                System.out.println("Password cannot be empty or less than 4 characters!");
            } else {
                System.out.println("Password selected: " + password);
                return password;

            }
            
        }

        
    }

    public static void main(String[] args) {
        loginUsername();

        scanner.close();
    }

}
