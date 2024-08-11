package Basic_Learning.String;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        System.out.println(sb);
        // System.out.println(useAppend(sb.toString()));
        useLoop(sb.toString());
    }

    public static String useAppend(String str) 
    {
        StringBuilder sb = new StringBuilder(str);
        for ( char ch = 'B'; ch <= 'Z'; ch++) 
        {
            sb.append(ch);
        }
        return sb.toString();
    }
    
    public static void useLoop(String str) 
    {
        for ( char ch = 'B'; ch <= 'Z'; ch++) 
        {
            str += ch;
        }
        System.out.println(str);
    }
}
