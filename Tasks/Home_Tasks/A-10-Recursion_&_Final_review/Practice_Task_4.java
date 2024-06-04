import java.util.Scanner;

public class Practice_Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean check = isHappyNumber(num);
        System.out.println(check);
    }

    public static boolean isHappyNumber(int n) {
        int sum = squareSum(n);
        // System.out.println("Sum: " + sum);
        int check_1 = digit_sum(sum);
        // System.out.println("Check_1: " + check_1);
        return check_1 == 1;
    }

    public static int squareSum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            sum += digit * digit;
        }
        return sum;
    }

    public static int digit_sum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            sum += digit;
        }
        return sum;
    }
}
