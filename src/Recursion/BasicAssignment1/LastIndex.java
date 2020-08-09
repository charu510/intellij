package Recursion.BasicAssignment1;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        int idx=ar.length-1;
        int target=s.nextInt();
        System.out.println(Last(ar,idx,target));
    }
    public static int Last(int[] ar,int idx,int target){
        if(idx<0)
            return -1;
        if(ar[idx]==target)
            return idx;
        return Last(ar,idx-1,target);
    }
}
