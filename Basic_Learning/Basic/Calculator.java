import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the first integer
        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        // Enter the second integer
        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        // Enter the operator
        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        int result = 0;

        // Perform the corresponding calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        // Print the output
        System.out.println("Output: " + result);
        
        
        scanner.close();
        
    }
}
