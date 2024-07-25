import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int number;

        // Get the input and validate it
        System.out.println("Pick a positive integer:");
        number = keyb.nextInt();

        // Make sure the input is a positive integer
        while (number < 0) {
            System.out.println("Enter a positive integer:");
            number = keyb.nextInt();
        }

        // Calculate nth Fibonacci number
        int fibonacci = calculateFibonacci(number);

        // Print the nth Fibonacci number
        System.out.println("The " + number + "th Fibonacci number is " + fibonacci);
    }

    // Method to calculate nth Fibonacci number
    public static int calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int prev1 = 0, prev2 = 1;
            int fibonacci = 1;
            for (int i = 2; i <= n; i++) {
                fibonacci = prev1 + prev2;
                prev1 = prev2;
                prev2 = fibonacci;
            }
            return fibonacci;
        }
    }
}
