package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class ClassWork_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char split = sc.next().charAt(0);
        sc.close();
        for(int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i) == split) {
                System.out.println();
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
