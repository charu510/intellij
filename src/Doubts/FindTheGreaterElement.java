package Doubts;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheGreaterElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        greater(ar);
    }
    public static void greater(int[] ar){
        int[] ans = new int[ar.length];
        for (int i = 0; i <ar.length-1 ; i++) {
            if(ar[i]<ar[i+1])
                ans[i]=ar[i+1];
            else if(ar[ar.length-1]>ar[0] && ar[ar.length-1]>ar[i])
                ans[i]=-1;

        }
        System.out.println(Arrays.toString(ans));
    }
}
