package Basic_Learning.Method;

import java.util.Scanner;
import java.util.Arrays;

public class arraySoring {
    public static void main(String[] args) {
        int[] arr = arrayMaker();
        System.out.print("Built Array: ");
        System.out.println(Arrays.toString(arr));
        arraySorting(arr);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayMaker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter elements of the the array: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int[] arraySorting(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int max = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    max = a[j];
                    a[j] = a[i];
                    a[i] = max;
                }
            }
        }
        return a;
    }
}
