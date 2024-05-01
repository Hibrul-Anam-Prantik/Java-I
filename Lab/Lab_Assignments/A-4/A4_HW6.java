import java.util.Scanner;
public class A4_HW6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // Part a: Check if the number is a prime number
        boolean prime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        // Part b: Check if the number is a perfect number
        int sum = 1; // Start with 1 as it is always a divisor
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Print the results
        if (prime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
        sc.close();
    }
}