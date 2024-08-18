package Tasks.Class_Works.Lab_7;

import java.util.Scanner;

public class Evaluation_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int i = str.length() - 1;
    while (i >= 0) 
    {
      System.out.print(str.charAt(i--));
    }
    sc.close();
  }
}