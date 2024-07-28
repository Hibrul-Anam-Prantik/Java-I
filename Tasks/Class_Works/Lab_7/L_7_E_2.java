import java.util.Scanner;
public class L_7_E_2{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String s =sc.nextLine();
    int cV=0;
    int cC=0;
    
    for (int i =0;i<s.length()-1;i++){
      s = s.toLowerCase();
      char ch =s.charAt(i);
      
      if (ch>='a' && ch<='z'){
        
        if(ch=='a' ||ch== 'e'||ch=='i' ||ch== 'o'||ch=='u'){
          cV++;
        }
        else{
          cC++;
        }
      }
      
    }
    System.out.println(cV);
    System.out.println(cC);
    if(cV % 3 == 0 && cC % 5 == 0 && cV != 0 && cC != 0){
      System.out.println("Aaarr! Me Plunder!! ");
    }
    else{
      System.out.println("Blimey! No Plunder!! ");
    }
    sc.close();
  }
}
