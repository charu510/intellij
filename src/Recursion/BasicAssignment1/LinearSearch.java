package Recursion.BasicAssignment1;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        int start = 0; //left index
        int end = ar.length-1;  //right index
        int target = s.nextInt();
        System.out.println(search(ar,start,end,target));
    }
    public static int search(int[] ar,int l,int r,int target){
        if(r<l)
            return -1;
        if(ar[l]==target)
            return l;
        if(ar[r]==target)
            return r;
        return search(ar,l+1,r-1,target);
    }
}
