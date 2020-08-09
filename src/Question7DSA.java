import java.util.Arrays;
import java.util.Scanner;

public class Question7DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int t = max(arr, arr.length - i - 1);
            int temp = arr[0];
            arr[0] = arr[t];
            arr[t] = temp;
            // max at last
            temp = arr[0];
            arr[0] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int max(int[] arr, int end) {
        int max = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}