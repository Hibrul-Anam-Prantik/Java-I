package Array_2D;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6; // sc.nextInt();
        int m = 6; // sc.nextInt();
        int[][] arr = makeArray(n, m);
        printArray(arr);
        System.out.println("=====" + 0 + "=====");
        int t = 1;
        int[][] hG;
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if ((i + 2) < 6) {
                for (int j = 0; j < 6; j++) {
                    if ((j + 2) < 6) {
                        hG = hourGlass(arr, i, j);
                        printArray(hG);
                        int tempSum = sumHG(hG);
                        if (tempSum > sum)
                            sum = tempSum;
                        System.out.println("=====" + (t++) + "=====");
                    }
                }
            }
        }
        System.out.println("Summation: " + sum);
        sc.close();
    }

    // Makes Array
    public static int[][] makeArray(int n, int m) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // int[][] arr2 = {{1, 1, 1, 0, 0, 0},
        // {0, 1, 0, 0, 0, 0},
        // {1, 1, 1, 0, 0, 0},
        // {0, 0, 0, 0, 0, 0},
        // {0, 0, 0, 0, 0, 0},
        // {0, 0, 0, 0, 0, 0}};
        sc.close();
        return arr;
    }

    // Prints Array
    static void printArray(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // HourGlass
    public static int[][] hourGlass(int[][] arr, int n, int m) {
        int[][] hourGlass = new int[3][3];
        for (int i = 0; i < 3; i++) {
            int k = m;
            for (int j = 0; j < 3; j++) {
                hourGlass[i][j] = arr[n][k];
                k++;
            }
            n++;
        }
        return hourGlass;
    }

    // Sum of HourGlass
    public static int sumHG(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != 1 && j > 0 || j < 2) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
