package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        reverse(ar,0,ar.length-1);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]);
        }
    }
    public static void swap(int[] ar,int start,int end){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }
    public static void reverse(int[] ar,int start,int end){
        while(start<end){
            swap(ar,start,end);
            start++;
            end--;
        }
    }

}
