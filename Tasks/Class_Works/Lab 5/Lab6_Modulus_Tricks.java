public class Lab6_Modulus_Tricks{
  public static void main(String []args){
    int a ; double b;
    a = -7 ; b = 2.5;
    /// Formula,a%b= a-b*(int)(a/b)
    System.out.println(a-b*(int)(a/b));
  }
}