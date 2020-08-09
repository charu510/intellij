package Recursion.Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }

    public static void swap(int[] ar,int start,int end){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }
    public static void reverse(int[] ar,int start,int end){
        if(start==end)
            return;
        if(start<end) {
            swap(ar, start, end);
        }
        reverse(ar,start+1,end-1);
    }
}
