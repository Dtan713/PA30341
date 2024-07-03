public class PA30341part3 {
        public static void main(String[] args) {
            // Declare an integer variable x and assign 15 to it
            int x = 15;

            // Write an if-else-if statement to print different messages based on the value of x
            if (x < 10) {
                System.out.println("Less than 10");
            } else if (x >= 10 && x < 20) {
                System.out.println("Between 10 and 20");
            } else {
                System.out.println("Greater than or equal to 20");
            }

            // Change x to equal 50
            x = 50;

            // Notice the result
            // Since x is now 50, the condition x >= 20 is true, so it will print "Greater than or equal to 20"
        }
    }


