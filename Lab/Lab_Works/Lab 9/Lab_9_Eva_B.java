import java.util.Scanner;
public class Lab_9_Eva_B{
  
  public static boolean triArea(int a, int b, int c){
    if ( a+b > c && a+c > b && b+c > a){
      return true;
    } else{
      return false;
    }
  }
  
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean res = triArea(a,b,c);
    if ( res ){
      double s = (a+b+c)/2;
      double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println(area);
    }
    else {
      System.out.println("Can’t form triangle");
    }
    sc.close();
  }
}