public class Practise_Task_7_Prime_Perfect {
    public static void main(String[] args) {
        int arr[] = { 6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7 };
        System.out.println("Prime Numbers:");
        prime(arr);
        System.out.println();
        System.out.println("Perfect Numbers:");
        perfect(arr);
    }

    public static void prime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i + ": " + arr[i]);
            }
        }
    }

    public static void perfect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 1; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum += j;
                }
            }
            if (arr[i] == sum) {
                System.out.println(i + ": " + arr[i]);
            }
        }
    }
}