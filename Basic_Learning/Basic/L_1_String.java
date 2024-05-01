import java.util.Scanner;
public class L_1_String{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
/*    System.out.print("Enter any String: ");
    String s = sc.nextLine();
    ///int l = s.length();
    
    for (int i = 0; i < s.length(); i++){
      System.out.println((i+1) + " => " + s.charAt(i));
    }
*/
    System.out.print("s1: ");
    String s1 = sc.nextLine();
    System.out.print("s2: ");
    String s2 = sc.nextLine();
    System.out.print("s3: ");
    String s3 = s1;
    System.out.println(s3);
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1.equals(s2): " + s1.equals(s2));
    System.out.println("s1 == s3: " + (s1 == s3)+"   |   as, String s1 = s3");
///    System.out.println("s1.compareTo(s2): "+s1.compareTo(s2));
    System.out.println("s1.toLowerCase(): "+ s1.toLowerCase());
    System.out.println("s2.toUpperCase(): "+ s2.toUpperCase());
    sc.close();
  }
}