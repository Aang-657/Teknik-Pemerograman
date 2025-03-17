import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        
        // Get line of input from user
        System.out.println("Enter a line of text:");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Process each token in the input line
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Ignore non-integer tokens and continue the loop
                // System.out.println("Skipping non-integer: " + e.getMessage()); // (Opsional untuk debugging)
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
