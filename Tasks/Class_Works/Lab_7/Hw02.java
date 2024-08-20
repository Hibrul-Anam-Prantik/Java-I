package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class Hw02 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = 1;
        int i = 0;
        // String newStr = "";
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
    }    
}
