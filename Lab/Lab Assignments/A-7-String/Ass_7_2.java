import java.util.Scanner;
public class Ass_7_2{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String s = sc.nextLine();
    String s1="";
    String s2="";
    int count=0;
    String new_s="";
    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      s1 = s1 + c;  
      if(!s1.equals(s2)){
        for(int j = i; j < s.length(); j++){
          if(s1.equals(""+s.charAt(j))){
            count++;
          }
          else{
            break;
          }
        }
        new_s = new_s + s1 + count;
        count=0;
      }
      s2 = s1;
      s1="";
    }
    System.out.print(new_s);
    sc.close();
  }
}