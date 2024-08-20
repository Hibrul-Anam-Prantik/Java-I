package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class Hw04 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String newStr = "";
        int j = 0;   // to handle the spaces and keep track
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
            {
                if ((j == 0 || j % 2 == 0)) {
                    if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {       
                        char ch = (char)(str.charAt(i) + 32);   // making the LowerCase characters
                        newStr += ch;
                    } else {
                        newStr += str.charAt(i);
                    }
                } 
                else {
                    if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                        char ch = (char)(str.charAt(i) - 32);   // making the UpperCase characters
                        newStr += ch;
                    } else {
                        newStr += str.charAt(i);
                    }
                }
                j ++;
            } 
            else 
            {
                newStr += str.charAt(i);    // handling spaces and other signs
            }
        }
        System.out.println(newStr);
    }
}
