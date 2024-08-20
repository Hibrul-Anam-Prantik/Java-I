package Tasks.Home_Tasks.A_7_String;
import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String newStr = "";
        for(int i = str.length() - 1; i >= 0; i--) 
        {
            if (str.charAt(i) == ' ') {
                for (int j = newStr.length() - 1; j >= 0 ; j--) 
                {
                    System.out.print(newStr.charAt(j));
                }
                System.out.print(" ");
                newStr = "";
            } 
            if (str.charAt(i) != ' ') {  
                newStr += str.charAt(i);
            }
            if(i == 0) {
                for (int j = newStr.length() - 1; j >= 0 ; j--) 
                {
                    System.out.print(newStr.charAt(j));
                }
            }
        }
    }
}
