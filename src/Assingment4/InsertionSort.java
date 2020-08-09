package Assingment4;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        insertiosort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void swap(int start,int end,int[] ar){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }
    public static void insertiosort(int[] ar){
        for (int i = 0; i <ar.length-1 ; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(ar[j]<ar[j-1])
                    swap(j,j-1,ar);
            }
        }
    }

    public static class SelectionSort {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i <ar.length ; i++) {
                ar[i]=s.nextInt();
            }
            selectiosort(ar);
            System.out.println(Arrays.toString(ar));
        }
        public static int maxIndex(int start,int end,int[] ar){
            int max=start;
            for (int i = 1; i <=end ; i++) /*Because we are traversing through the whole array length*/ {
                if(ar[i]>ar[max])
                    max=i;
            }
            return max;
        }
        public static void swap(int start,int end,int[] ar){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
        }
        public static void selectiosort(int[] ar){
            for (int i = 0; i <ar.length ; i++) {
                int maximum=maxIndex(0,ar.length-1-i,ar);
                swap(maximum,ar.length-1-i,ar);
            }
        }
    }
}
