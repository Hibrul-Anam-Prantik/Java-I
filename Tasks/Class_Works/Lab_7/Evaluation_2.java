package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class Evaluation_2 
{
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int countV = 0;
        int countC = 0;
        int i = 0;
        while( i < str.length() ) 
        {
            char ch = str.charAt(i++);
            if (ch >= 'a' && ch <= 'z')   
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countV++;
                } else {
                    countC++;
                }
            }
        }
        if (countV != 0 && countC != 0 && countV % 3 == 0 && countC % 5 ==0) {
            System.out.println("Aaarr! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }
        sc.close();
    }
}
