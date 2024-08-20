package Tasks.Home_Tasks.A_7_String;

import java.util.Scanner;

public class Hw05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        for (int i = 0; i < str2.length(); i++) 
        {
            int j = 0;
            String tempStr = "";
            while(j < str1.length()) 
            {
                if (str1.toLowerCase().charAt(j) == str2.toLowerCase().charAt(i)) {
                    tempStr += "";
                } else {
                    tempStr += str1.charAt(j);
                }
                j ++;
            }
            str1 = tempStr;
        }
        System.out.println(str1);
    }
}
