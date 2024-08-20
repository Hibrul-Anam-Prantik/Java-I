package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class Hw06 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        sc.close();
        int len = password.length();
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialCh = false;
        if (len >= 8) {
            for (int i = 0; i < len; i++) 
            {
                char ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    upperCase = true;
                }
                else if (ch >= 'a' && ch <= 'z') {
                    lowerCase = true;
                }
                else if (ch >= '0' && ch <= '9') {
                    digit = true;
                }
                else {
                    specialCh = true;
                }
            }
            if(upperCase && lowerCase && digit && specialCh) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        else {
            System.out.println("False");
        }
    }
}
