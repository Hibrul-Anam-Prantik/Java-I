public class method_with_and_without_void 
{
    public static int adder1(int a, int b)
    {
        //int sum = a+b;
        //return sum;
        return a+b;
    }
    public static void adder2(int a, int b)
    {
        int sum = a+b; 
        System.out.print(" _____From \"adder2\"_____\n      Summation: "+ sum);
    }
    public static void main(String [] args)
    {
        int x = 10;
        int y = 40;
        System.out.println("SUMMATION OF TWO NUMBERS \n\n _____From \"adder1\"_____\n      Summation: "+adder1(x, y));
        System.out.println();
        adder2(x,y);
    }
}
