package Assingment4;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Scanner;

public class TargetPair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i <ar1.length ; i++) {
            ar1[i] = s.nextInt();
        }
        Arrays.sort(ar1);
        int target = s.nextInt();
        System.out.println(TargetPair(ar1,target));
    }
    public static boolean TargetPair(int[] ar,int target){
        int start=ar[0];
        int end = ar.length-1;
        while(start<end){
            if(ar[start]+ar[end]==target){
                return true;
            }
            else if(ar[start]+ar[end]<target){
                start++;
            }
            else
                end--;
            if(true)
                System.out.println(ar[start]+" "+ar[end]);
        }
            return false;

    }
}
