package Basic_Learning.Method;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(num + "! = " + factorial(num));
    }

    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }
}