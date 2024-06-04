public class Ass_9_HW2{
  //A showDots
  public static void showDots(int a){
    for ( int i = 0; i < a; i++){
      System.out.print(".");
    }
  }
  
//B show_palindrome
  public static void show_palindrome(int a){
    for ( int i = 1; i <= a; i++){
      System.out.print(i);
    }
    for ( int i = a-1; i >=1; i--){
      System.out.print(i);
    }
  }
  
  // C showDiamond
  public static void showDiamond(int a){
    for ( int i = a-1; i >=1; i--){
      showDots(i);
      show_palindrome(a-i);
      showDots(i);
      System.out.println();
    }
    for ( int i = a; i >=1; i--){
      showDots(a-i);
      show_palindrome(i);
      showDots(a-i);
      System.out.println();
    }
  }
  
  //Main 
  public static void main(String [] args){
    showDots(5);
    System.out.println();
    showDots(3);
    System.out.println();
    show_palindrome(5);
    System.out.println();
    show_palindrome(3);
    System.out.println();   
    showDiamond(5);
    showDiamond(3);
  }
}