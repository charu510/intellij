package Recursion.Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class InverseArrayRecursion {

    public static void main(String args[]) {
            int arr[] = { 1, 2, 3, 4, 0 };
            int br [] = new int [arr.length];
            inverse(arr, br, 0, arr.length-1);
            System.out.println(Arrays.toString(br));

        }

        public static void inverse(int[] ar, int[] br, int start, int end) {

            if (start > end)
                return;

            int temp = ar[start];
            br[temp] = start;
            br[ar[end]] = end;

            inverse(ar, br, start + 1, end - 1);
        }
    }

