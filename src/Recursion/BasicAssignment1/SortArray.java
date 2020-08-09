package Recursion.BasicAssignment1;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] ar = {4,1,2,3};
        int n = ar.length;
        System.out.println(sort(ar,n));
        //System.out.println(sortedornot(ar,0));

    }
    public static boolean sort(int[] ar,int n){
        if(n==1 || n==0)
            return true;
        if(ar[n-1]<ar[n-2])
            return false;
        return sort(ar,n-1);
    }


}
