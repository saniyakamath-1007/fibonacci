import java.util.Scanner;

public class FibonacciRecursive {
    
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        try {
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
