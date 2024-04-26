import java.util.Arrays;
class Test{
  public static void main(String args[]){
    int[] arr1 = {3,2,0,1,5,6,7};
    int[] arr2 = {30,20,40,11,55,-34,100};
    int a1 = 0, a2 = 0;
    while (a1<arr1.length-1){
      arr2[a1] = arr1[a2]+ a1 - arr2[a2];
      a2 = 1;
      while (a2 < a1 ){
        arr2[a1] = arr2[a1] + arr1[a2] - a2;
        a2 = a2 + 1;
      }
      System.out.println(arr2[a1]);
      a1 = a1 + 1;
    }
    System.out.println(arr2[arr1[a2]]);
  }
}