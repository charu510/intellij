package Doubts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTriplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        int target=s.nextInt();
        triplet(ar,target);

    }
    public static void swap(int start,int end,int[] ar){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }
    public static void bubblesort(int[] ar){
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar.length-1-i ; j++) {
                if(ar[j]>ar[j+1])
                    swap(j,j+1,ar);
            }
        }
    }

    public static void triplet(int[] ar,int target){
        int sum=0;
        bubblesort(ar);
        for (int i = 0; i <ar.length ; i++) {
            sum = ar[i] + ar[i + 1] + ar[i + 2];
            if (sum == target) {
                System.out.println(ar[i]);
                System.out.println(ar[i + 1]);
                System.out.println(ar[i + 2]);
            }
        }
    }
}
