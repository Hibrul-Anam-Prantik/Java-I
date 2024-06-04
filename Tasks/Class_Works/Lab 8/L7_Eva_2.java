import java.util.Scanner;
public class L7_Eva_2{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    int ar [] = new int [N];
    for (int i = 0; i < N; i++){
      System.out.print("Enter a number: ");
      ar[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    boolean found = false;
    for ( int i = 0; i < N; i++){
      if ( ar[i] == x ){
        System.out.print(x+" is at index "+i);
        found = true;
        break;
      }
    }
    if (found == false){
      System.out.print("Element not found"); 
    }
    sc.close();
  }
}