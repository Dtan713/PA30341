import java.util.Scanner;

public class PA30341part6 {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number between 1 and 7
            System.out.print("Enter a number between 1 and 7: ");
            int dayNumber = scanner.nextInt();

            // Close the scanner to prevent resource leak
            scanner.close();

            // Use switch statement to print corresponding weekday
            switch (dayNumber) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Out of range");
                    break;
            }
        }
    }


