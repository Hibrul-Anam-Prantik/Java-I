import java.util.Scanner;
public class Ass_8_4{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Please enter the length of array: ");
    int len = sc.nextInt();
    int arr[] = new int[len];
    System.out.println("Please enter the elements of the array:");
    for ( int i = 0; i < len; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Please enter the target value:");
    int tar = sc.nextInt();
    boolean sum = false;
    for ( int i = 0; i < len; i++){
      for ( int j =  i+ 1; j < len; j++){
        if ( arr[i] + arr[j] == tar){
          sum = true;
          System.out.println("Elements need to be added: "+arr[i]+" "+arr[j]);
          System.out.println("Index of the elements: "+i+" and "+j);
          break;  
        }
      }
      if ( sum ){
        
        break;
      }
    }
    if (!sum){
      System.out.println("Target value not found");
    }   
    sc.close();
  }
}