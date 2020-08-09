package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumofArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i <ar1.length ; i++) {
            ar1[i] = s.nextInt();
        }

        int m = s.nextInt();
        int[] ar2 = new int[m];
        for (int i = 0; i <ar2.length ; i++) {
            ar2[i]=s.nextInt();
        }
            int[] ar3 = new int[ar1.length];
        for (int i = 0; i <ar3.length ; i++) {
                ar3[i] = ar1[i]+ar2[i];
        }
        System.out.println(Arrays.toString(ar3));
    }

    }


