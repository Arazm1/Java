import java.util.Scanner;

public class QuizGame {
    static Scanner scanner = new Scanner(System.in);


    static void TheGame() {
        String[] questions = { "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launcher?",
                "Who is known as the inventor of computer",
                "What was the first programming language" };

        String[][] options = {
                { "1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords" },
                { "1. CPU", "2. Hard drive", "3. RAM", "4. GPU" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2008" },
                { "1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage" },
                { "1. COBOL", "2. C", "3. Fortran", "4. Assembly" } };

        int[] answers = { 3, 1, 2, 4, 3 };
        int score = 0;
        int guess;

        System.out.println("*************************");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("*************************");
        System.out.println("");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);

            }

            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Wrong answer! The correct answer was " + options[i][answers[i] - 1]);
            }

        }
        System.out.println("");
        System.out.println("********************************");
        System.out.println("Your final socre is: " + score + " out of " + questions.length + ".");
        System.out.println("********************************");

        
        
    }






    public static void main(String[] args) {

        while (true) {
            System.out.print("Would you like to play the Quiz Game? ");
            String playOrNot = scanner.nextLine().trim().toLowerCase();

            if (playOrNot.equals("yes") || playOrNot.equals("y")) {
                TheGame();
            } else {
                System.out.println("Maybe next time...");
                break;
            }
        }
        scanner.close();


        
}
}
