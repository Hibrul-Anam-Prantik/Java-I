import java.util.Scanner;
public class L_7_2{
  public static void main(String []args){
    Scanner sc =  new Scanner (System.in);
    String n = sc.nextLine();
    
    String s ="";
    
    
    for(int j = n.length()-1; j >= 0; j--){
      char y = n.charAt(j);
      int ascii = (int)y;
      s = s+(char)ascii;
    }
    System.out.println(s);
    System.out.println(s.equals(n));
    sc.close();
  }
}