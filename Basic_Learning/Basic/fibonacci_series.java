// 0 1 1 2 3 5 8 13 21 34 55

public class fibonacci_series 
{
    public static void main(String[] args) 
    {
        int pre_n1 = 0;
        int pre_n2 = 1;
        int post_n = 0;
        
        for ( int i = 0;i < 10; i++){
            if (i == 0){
                System.out.println(pre_n1);
            } else if (i == 1){
                System.out.println(pre_n2);
            } else if (i >= 2){
                post_n = pre_n1+pre_n2;
                System.out.println(post_n);
                pre_n1 = pre_n2;
                pre_n2 = post_n;
            }
        }
    }
}
