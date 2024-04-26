import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three float numbers
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter third number: ");
        float num3 = sc.nextFloat();

        // Calculate maximum and minimum using else-if conditions
        float max, min;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
            System.out.println("Maximum number is " + max);
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
            System.out.println("Maximum number is " + max);
        } else {
            max = num3;
            System.out.println("Maximum number is " + max);
        }

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
            System.out.println("Minimum number is " + min);
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
            System.out.println("Minimum number is " + min);
        } else {
            min = num3;
            System.out.println("Minimum number is " + min);
        sc.close();
        }
        
    }
}
