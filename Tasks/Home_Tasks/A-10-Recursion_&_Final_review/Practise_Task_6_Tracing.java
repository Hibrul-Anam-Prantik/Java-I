public class Practise_Task_6_Tracing {
    public static void main(String args[]) {
        int[] arr1 = { 3, 1, 4, 1, 5, 9, 2 };
        int[] arr2 = { 10, 20, 30, 40, 50, 60, 70 };
        int x = 0, y = 0;
        while (x < arr1.length - 1) {
            arr2[x] = arr1[y] * (x + 1) - arr2[y];
            y = 1;
            while (y <= x) {
                arr2[x] = arr2[x] + arr1[y] - y;
                y = y + 1;
            }
            System.out.println(arr2[x]);
            x = x + 1;
        }
        System.out.println(arr2[arr1.length - 1]);
    }
}
