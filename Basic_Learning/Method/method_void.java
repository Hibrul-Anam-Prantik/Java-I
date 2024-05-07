public class method_void 
{
    public static void f1()
    {
        System.out.print("CSE ");
        f2();
    }
    public static void f2()
    {
        System.out.print("is ");
        f3();
    }
    public static void f3()
    {
        System.out.print("Fun");
    }
    public static void main(String[] args) 
    {
        f1();    
    }
}
