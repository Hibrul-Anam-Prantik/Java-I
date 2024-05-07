import java.util.Scanner;

public class method_2
{
    public static String f1(Scanner sc)
    {
        String s1 = sc.nextLine();
        return s1 + f2(sc);
    }
    public static String f2(Scanner sc)
    {
        String s1 = sc.nextLine();
        return s1 + f3(sc);
    }
    public static String f3(Scanner sc)
    {
        String s1 = sc.nextLine();
        return s1;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String: ");
        System.out.println(f1(sc));
        sc.close();
    }
}