package Assingment4;

import Arrays.Question1;
import Assingment4.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        bubblesort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void bubblesort(int[] ar){
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar.length-1-i ; j++) {
                if(ar[j]>ar[j+1])
                    InsertionSort.swap(j,j+1,ar);
            }
        }
    }
}
