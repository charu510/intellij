package Doubts;

import java.util.Scanner;
import java.util.ArrayList;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i <ar1.length ; i++) {
            ar1[i]=s.nextInt();
        }
        int m = s.nextInt();
        int[] ar2 = new int[n];
        for (int i = 0; i <ar2.length ; i++) {
            ar2[i]=s.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int carry=0;
        int i=ar1.length-1;
        int j=ar2.length-1;
        while(i>=0 || j>=0){
            int sum=0;
            if(i>=0){
                sum+=ar1[i];
            }
            if(j>=0){
                sum+=ar2[j];
            }
            sum+=carry;
            list.add(0,sum%10);
            carry=sum/10;
        }
        if(carry!=0){
            list.add(0,carry);
        }


    }
}
