public class method_2_easy_String
{           
    public static String func1()
    {
        return "Method " + func2();
    }
    public static String func2()
    {
        return "Is " + func3();
    }
    public static String func3()
    {
        return "Awesome ";
    }

    public static void main(String [] args)
    {
        System.out.println(func1());
    }
}
