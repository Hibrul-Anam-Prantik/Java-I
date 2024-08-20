package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class Hw07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        int count = 0;
        for (int i = 0; i < str1.length() - 1; i++) 
        {
            String temp = "" +str1.charAt(i) + str1.charAt(i+1); 
            if (temp.equalsIgnoreCase(str2)) {
                count ++;
            }
        }
        System.out.println("Occurrence: " + count + " times");
    }
}
