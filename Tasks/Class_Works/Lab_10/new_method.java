package Tasks.Class_Works.Lab_10;
import java.util.*;
public class new_method
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of \"x\" & \"y\" to calculate (x - y):\n__________________________\n");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();
        System.out.println("__________________________\nResult:\n"+x+" - "+y+" = "+calc(x,y)+" (Ans)");
        sc.close();
    }
    public static int calc(int a, int b)
    {
        return a - b;
    }
}
