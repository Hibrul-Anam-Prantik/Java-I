import java.util.Scanner;
public class Lab_9_Eva_A{
  
  public static boolean isTriangle(int a, int b, int c){
    if ( a+b > c && a+c > b && b+c > a){
      return true;
    } else{
      return false;
    }
  }
  
  public static double triArea(int a, int b, int c){
    double s = (a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    
    return area;
  }
  
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean res = isTriangle(a,b,c);
    double r = triArea(a,b,c);
    if ( res ){
      System.out.print( res ); 
      System.out.printf("\n%.3f", r );
    } else {
      System.out.println( res ); 
      System.out.println("Can’t form triangle");
    }
    sc.close();
  }
}