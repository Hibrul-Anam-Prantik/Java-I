import java.util.Scanner;
public class VowelConsonant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char ch = sc.next().charAt(0);
/*    if (ch == 'a') {
      System.out.println("Vowel");
    }
    else if (ch == 'e'){
      System.out.println("Vowel");
    }
    else if (ch == 'i'){
      System.out.println("Vowel");
    }
    else if (ch == 'o'){
      System.out.println("Vowel");
    }
    else if (ch == 'u'){
      System.out.println("Vowel");
    }
    else{
      System.out.println("Consonant");
    }
    sc.close();
*/
///OR,
    if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
      System.out.println("Vowel");
    }
    else{
      System.out.println("Consonant");
    }
    sc.close();
  }
}
