import java.util.Scanner;
public class Ass_7_1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1="";
    String s2 ="";
    for ( int i = s.length()-1; i >= 0; i--){
      char c = s.charAt(i);
      
      s1 = s1+c;
      
      if ( c == ' '){
        for ( int j = s1.length()-2; j >= 0 ; j--){
          char c1 = s1.charAt(j);
          s2 = s2 + c1; 
        }
        System.out.print(s2+" ");
        s1="";
        s2="";
        
      }
      if ( i==0){
        for ( int j = s1.length()-1; j >= 0 ; j--){
          char c1 = s1.charAt(j);
          s2 = s2 + c1; 
        }
        System.out.print(s2);
      }
    }
    sc.close();
  }
}