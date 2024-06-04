public class Ass_8_6{
  public static void main(String [] args){
    int [] marks = {85, 90, 75, 44, 99};
    String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    //Bubble Sort
    System.out.println("Sorted Array:");
    for ( int i = 0; i < marks.length-1; i++ ){
      for ( int j = 0; j<marks.length-i-1; j++){
        if( marks[j] > marks[j+1]){
          //swap marks
          int temp = marks[j];
          marks[j] = marks[j+1];
          marks[j+1] = temp;
          //swap names
          String temp_name = names[j];
          names[j] = names[j+1];
          names[j+1] = temp_name;
        }
      }
    }
    //Sorted Marks
    for(int i = 0; i < marks.length; i++){
      System.out.print(marks[i]+" ");
    }
    //Sorted Names
    System.out.println();
    for(int i = 0; i < names.length; i++){
      System.out.print(names[i]+" ");
    }
  }
}