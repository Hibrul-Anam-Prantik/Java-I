import java.util.Scanner;
public class Ass_7_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Given String 1: ");
    String s1 = sc.nextLine();
    System.out.print("Given String 2: ");
    String s2 = sc.nextLine();
    String s3 = "";
    String s4 = "";
    String s5 = "";
    for ( int i = 0; i < s2.length(); i++){
      
      char c1 = s2.charAt(i);
      s3 += c1;
      for (int j = 0; j < s1.length(); j++){
        char c2 = s1.charAt(j);
        ///
        if ( !s3.equalsIgnoreCase(""+c2) ){
          
          s4 += c2;
          
          
        }
        else{
         /// s5 += s4;
          System.out.print(s4);
          s4 = "";
        }
      }
      
      s3 = "";
    }
    ///s5 = 
    
    sc.close();
  }
}