package Doubts;

import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length; i++) {
            ar[i]=s.nextInt();
        }
        SplitArray(ar,0,0,0,"","");
    }
    public static void SplitArray(int[] ar,int idx,int sum1,int sum2,String ans1,String ans2){
        //base case
        if(idx==ar.length){
            if(sum1==sum2){
                System.out.println(ans1+"and"+ans2);
            }
            return;
        }
        SplitArray(ar,idx+1,sum1+ar[idx],sum2,ans1+ar[idx]+" ",ans2);
        SplitArray(ar,idx+1,sum1,sum2+ar[idx],ans1,ans2+ar[idx]+" ");

    }
}
