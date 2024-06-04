public class Lab_9{
  public static int add(int a, int b){
    int result = a + b;
    return result;
  }
  public static int sum(int a, int b, int c, int d){
    int r = add(a,b);
    int s = add(c,d);
    return add(r,s);
  }
  public static void main(String [] args){
    int x = 5; int y = 7;
    int r = add(x,y);
    int s = sum(1,2,5,6);
    ///return;
    System.out.println("Sum: "+s);
  }
}