package Assingment4;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        selectionsort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void swap(int start,int end,int[] ar){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }
    public static int maxIndex(int start,int end,int ar[]){
        int max=start;
        for(int i=start;i<ar.length;i++){
            if(ar[i]>ar[max]){
                max=i;
            }
        }
        return max;
    }
    public static void selectionsort(int[] ar){
        for (int i = 0; i <ar.length ; i++) {
            int maximum=maxIndex(0,ar.length-i-1,ar);
                swap(maximum,ar.length-i-1,ar);
        }
    }

}