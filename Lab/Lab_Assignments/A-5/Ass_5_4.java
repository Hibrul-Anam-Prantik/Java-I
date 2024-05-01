public class Ass_5_4{
  public static void main(String args[]){
    int x = 0;
    int sum = 0;
    while (x < 6){
      int y = x +1;
      while (y < 9){
        if (x%y==0){
          break;
        }
        sum = (sum % 3) + x - y * 3 ;
        System.out.println(sum);
        y = y + 1;
      }
      if (x > 5){
        x++;
      }else{
        x += 2;
      }
      System.out.println(x%3==0);
    }
  }
}