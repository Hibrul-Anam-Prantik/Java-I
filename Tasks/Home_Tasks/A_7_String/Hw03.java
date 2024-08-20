package Tasks.Home_Tasks.A_7_String;

import java.util.Scanner;

public class Hw03 {
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        sc.close();
        String newStr = "";
        // Searching the unique character from the 1st String
        for (int i = 0; i < str1.length(); i++)
        {
            int count = 0;   // for unique character
            int j = 0;
            while (j < str2.length()) 
            {
                if (str2.charAt(j) == str1.charAt(i)) {  
                    count ++;   // if common character found
                    break;
                }
                j++;
            }
            if (count == 0) {          // checking if the character is unique
                char ch = (char)(str1.charAt(i) - 32);    // adding the character's UpperCase to newStr
                newStr += ch;
                
            }
        }
        // again same process for the 2nd String
        for (int i = 0; i < str2.length(); i++)
        {
            int count = 0;
            int j = 0;
            while (j < str1.length()) 
            {
                if (str1.charAt(j) == str2.charAt(i)) {
                    count ++;
                    break;
                }
                j++;
            }
            if (count == 0) {
                char ch = (char)(str2.charAt(i) - 32);    
                newStr += ch;    
            }
        }
        System.out.println(newStr);
    }
}
