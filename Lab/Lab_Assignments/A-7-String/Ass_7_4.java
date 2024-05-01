import java.util.Scanner;
public class Ass_7_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1 = "";
    int count = 0;
    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      int asci = (int)c;
      if( (asci >= 65 && asci <= 90) || (asci>=97 && asci<=122)){
        count++;
        if(count % 2 == 0){
          if(asci >= 97 && asci <= 122){
            asci -= 32;
            char c1 =(char)asci;
            s1 += c1;
          } else{
            s1 += c;
          }
        } else{
          if( asci >= 65 && asci <= 90 ){
            asci += 32;
            char c2 =(char)asci;
            s1 += c2;
          } else{
            s1 += c;
          }
        }
      } else{
        s1 += c;
      }
    }
    System.out.println(s1);
    sc.close();
  }
}