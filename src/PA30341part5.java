
   import java.util.Scanner;
   public class PA30341part5 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a score
            System.out.print("Enter the score: ");
            int score = scanner.nextInt();

            // Close the scanner to prevent resource leak
            scanner.close();

            // Determine the grade based on the score using if-else-if statements
            if (score < 0 || score > 100) {
                System.out.println("Score out of range");
            } else if (score >= 90 && score <= 100) {
                System.out.println("Grade: A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Grade: B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Grade: C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
