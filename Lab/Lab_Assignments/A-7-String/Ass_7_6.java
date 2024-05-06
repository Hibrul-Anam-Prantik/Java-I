/*
    A strong password is defined by the following criteria:
    ➢ The password must be at least 8 characters long.
    ➢ The password must contain characters at least one -
    ➢ Uppercase letters (A-Z)
    ➢ Lowercase letters (a-z)
    ➢ Digits (0-9)
    ➢ Special characters (e.g., !, @, #, $, etc.)
 */


import java.util.Scanner;
public class Ass_7_6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Strong Passwod: ");
        String password = sc.nextLine();
        int l = password.length();
        boolean upper = false;
        boolean lower = false;
        boolean digits = false;
        boolean special_ch = false;
        if ( l >= 8 )
        {
            for (int i = 0; i < l; i++){
                char ch = password.charAt(i);
                if (ch >= 65 && ch <=90)
                {
                    upper = true;
                }
                else if (ch >= 97 && ch <= 122)
                {
                    lower = true;
                }
                else if ( ch >= 48 && ch <= 57)
                {
                    digits = true;
                }
                else
                {
                    special_ch = true;
                }
            }
        } else
        {
            System.out.print("False");
        }
        if ( upper && lower && digits && special_ch)
        {
            System.out.println("True");
        } else
        {
            System.out.println("False");
        }
        sc.close();
    }
}