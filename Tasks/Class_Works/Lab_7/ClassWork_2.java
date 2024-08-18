package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class ClassWork_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean palindrome = false;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
        sc.close();
    }
}
