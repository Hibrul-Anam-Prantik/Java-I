package Basic_Learning.String;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        System.out.println(sb);
        System.out.println(useAppend(sb.toString()));
        useLoop(sb.toString());
        String str = "aaabbccccaaaadddca";
        System.out.println(compress(str));
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

    public static String compress(String str) 
    {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;
                i ++;
            }
            newStr += str.charAt(i);
            if ( count > 1) {
                newStr += count;
            }
        }
        return newStr;
    }
}
