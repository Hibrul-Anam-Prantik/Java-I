package Basic_Learning.Method;

import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static int[] arrayMaker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Enter elements of the array: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Let's make an integer array.");
        int[] array = arrayMaker();
        System.out.print("The array we made: ");
        System.out.println(Arrays.toString(array));
    }
}
