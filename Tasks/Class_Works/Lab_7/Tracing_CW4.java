package Tasks.Class_Works.Lab_7;

public class Tracing_CW4 {
    public static void main(String[] args) {
        String test = "";
        int i = 1, j = 1, k = 14;
        test = "-->";
        while (i < 3) {
            j = --k;
            while (j > 10) {
                test = i + (j - 2) + "-->" + test;
                System.out.println(test);
                j -= 1;
            }
            i++;
        }
    }
}