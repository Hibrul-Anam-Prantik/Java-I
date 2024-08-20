package Tasks.Home_Tasks.A_7_String;

import java.util.Scanner;

public class Hw02 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = 1;
        int i = 0;
        while(i < str.length() - 1) 
        {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count ++;
                i ++;
                continue;
            }
            
            System.out.print(""+str.charAt(i) + count);
            count = 1;
            i ++;
        }
        System.out.print(""+str.charAt(str.length() - 1) + count);
        System.out.println();
        // another way to conpress =>
        compress(str);
    } 
    public static void compress(String str)
    {
        String newStr = ""; 
        for (int i = 0; i < str.length(); i++)
        {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) 
            {
                count ++;
                i ++;
            }
            newStr += str.charAt(i);
            newStr += count;
        }
        System.out.print(newStr);
    }   
}
