import java.util.Scanner;

public class Practice_Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        String S = sc.nextLine();
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        modifyStrings(S, S1, S2);
        sc.close();
    }

    public static void modifyStrings(String s, String s1, String s2) {
        String temp1 = "";
        String temp2 = "";
        for (int i = 0; i < s.length(); i++) {
            temp1 += s.charAt(i);
            if (temp1.equals(s1)) {

            }
            // System.out.println("temp1: " + temp1 + " ");
            /*
             * if (temp1.equals(s1)) {
             * temp1 = "";
             * temp2 += s2;
             * temp2 += s.charAt(i + 1);
             * // System.out.println("if_temp2: " + temp2 + "  ");
             * }
             */
            /*
             * if (!temp2.equals(temp1)) {
             * temp2 += s.charAt(i);
             * }
             */
            // temp2 += s.charAt(i);
            // System.out.println("below if_temp2: " + temp2 + " ");
        }
        System.out.println("Final_temp2 " + temp2);
    }
}
