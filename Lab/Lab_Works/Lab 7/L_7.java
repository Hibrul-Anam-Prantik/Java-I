///ClassWork 1
import java.util.Scanner;
public class L_7{
  public static void main(String []args){
    Scanner sc =  new Scanner (System.in);
    String n = sc.nextLine();
    String output ="";
    for (int i = 0; i < n.length(); i++){
      char store = n.charAt(i);
      int ascii = (int) store;
      if(ascii >= 97)
      {
        ascii = ascii -32;
      }
      output = output+(char)ascii;
    }
    System.out.print(output);
    sc.close();
  }
}