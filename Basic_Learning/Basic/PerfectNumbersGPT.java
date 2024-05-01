import java.util.Scanner;
public class PerfectNumbersGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); // You can change this value to find a different number of perfect numbers
        int count = 0;
        int number = 2;

        while (count < n) {
            int sum = 0;

            // Finding divisors and calculating their sum
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            // Checking if the number is perfect
            if (sum == number) {
                System.out.println(number);
                count++;
            }

            // Move on to the next number
            number++;
        }
        sc.close();
    }
}
