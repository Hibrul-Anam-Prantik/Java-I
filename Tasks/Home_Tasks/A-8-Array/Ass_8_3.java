import java.util.Scanner;
public class Ass_8_3{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Please enter the length of array 1: ");
    int len1 = sc.nextInt();
    int [] arr1 = new int[len1];
    System.out.println("Please enter the elements of the arr1:");
    for ( int i = 0; i < len1; i++ ){
      arr1[i] = sc.nextInt();
    }
    System.out.print("Please enter the length of array 2: ");
    int len2 = sc.nextInt();
    int arr2 [] = new int [len2];
    System.out.println("Please enter the elements of the arr2:");
    for ( int i = 0; i < len2; i++ ){
      arr2[i] = sc.nextInt();
    }
/*  System.out.println("Array 1:");
    for(int i = 0; i <len1;i++){
      System.out.print(arr1[i]+" ");
    }   
    System.out.println();
    System.out.println("Array 2:");
    for(int i = 0; i <len2;i++){
      System.out.print(arr2[i]+" ");
    }                                   
    System.out.println();                  */
    boolean subset = true;
    for(int i = 0; i < len2; i++){
      boolean equal = true;
      for(int j = 0; j < len1; j++){
        
        if ( arr2[i] == arr1[j]){
          equal = true;
          break;
        }
        else {
          equal = false;
        }
      }
      if ( !equal ){
        subset = false;
        break;
      }
    }
    if ( subset ){
      System.out.println("Array 2 is a subset of Array 1.");
    } else {
      System.out.println("Array 2 is not a subset of Array 1.");
    }
    sc.close();
  }
}