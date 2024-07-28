package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class ClassWork_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.nextLine());
        String newStr = "";
        for (int i = 0; i < str.length(); i++) 
        {
            // char ch = str.charAt(i); 
            int ascii = (int)str.charAt(i);
            if (ascii >= 97 && ascii <= 122) {
                ascii -= 32; 
            }
            newStr += (char)ascii;
        }
        System.out.println(newStr);
        sc.close();
    }
}
