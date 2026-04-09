import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read a and b
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();

                // TODO: try block
                try {
                    // Perform division
                    int result = a / b;
                    // Print "Result: " + result
                    System.out.println("Result: " + result);
                } 
                // TODO: catch ArithmeticException e
                catch (ArithmeticException e) {
                    // Print "Error: " + e.getMessage()
                    System.out.println("Error: " + e.getMessage());
                } 
                // TODO: finally block
                finally {
                    // Print "Finally block executed"
                    System.out.println("Finally block executed");
                }
            }
        }
        
        scanner.close();
    }
}
