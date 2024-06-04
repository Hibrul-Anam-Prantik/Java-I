import java.util.Scanner;
public class Ass_7_3{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    String s1 = sc.nextLine().toLowerCase();
    String s2 = sc.nextLine().toLowerCase();
    String s3 = "";String s4 = "";String s5 = "";String s6 = "";
   
    for(int i = 0; i < s1.length(); i++){
      char c1 = s1.charAt(i);
      for(int j = 0; j < s2.length(); j++){
        char c2 = s2.charAt(j);
       
        if ( c2 != c1){
          int ascii = (int)c1 - 32;
          s3 = "" + (char)ascii;
        } else{
          s3="";
          break;
        }
      }
      s4 = s4 + s3;
    }
    for (int i = 0; i < s2.length(); i++){
      char c1 = s2.charAt(i);
      for ( int j = 0; j < s1.length(); j++){
        char c2 = s1.charAt(j);
        if ( c2 != c1){
          int ascii = (int)c1 - 32;
          s3 = "" + (char)ascii;
        } else{
          s3 = "";
          break;
        }
      }
      s5 = s5 + s3;
    }
    s6 = s4 + s5;
    System.out.println(s6);
    sc.close();
  }
}