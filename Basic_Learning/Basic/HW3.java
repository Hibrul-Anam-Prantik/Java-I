  import java.util.Scanner;
  public class HW3{
    public static void main(String [] args){
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter any number,x: ");
      int x = sc.nextInt();
      int out;
      if (x<0){
        out = 2*x;
        System.out.println("output: "+out);
      }
      else if ((x>=0) && (x<2))
      {
        out = x+1;
        System.out.println("output: "+out);
      }
      else if ((x>=2) && (x<5))
      {
        out = (x*x)-1;
        System.out.println("output: "+out);
      }
      else if (x>=5)
      {
        out = (3*x*x)+2;
        System.out.println("output: "+out);
      }
      else {
        System.out.println("Invalid data");
      }
      sc.close();
    }
  }
      