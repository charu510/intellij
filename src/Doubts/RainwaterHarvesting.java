package Doubts;

import java.util.Scanner;

public class RainwaterHarvesting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println(maxWater(ar));
    }
    public static int maxWater(int[] ar){
       int[] left = new int[ar.length];
       left[0]=ar[0];
        for (int i = 1; i <ar.length; i++) {
           left[i]=Math.max(left[i-1],ar[i]);
        }
        int[] right = new int[ar.length];
        right[0]=ar[ar.length-1];
        for (int i = ar.length-2; i >=0 ; i--) {
            right[i]=Math.max(right[i+1],ar[i]);
        }
        int res=1;
        for (int i = 0; i <ar.length ; i++) {
            res=res+Math.min(left[i],right[i])-ar[i];
        }
        return res;
    }
}