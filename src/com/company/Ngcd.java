package com.company;

import java.util.Scanner;

public class Ngcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println(HCF(ar));
    }
    public static int gcd(int a,int b){
        int i=1;
        int gcd=0;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0)
                gcd=i;
            i++;
        }
        return gcd;
    }
    public static int HCF(int[] ar){
        int result=ar[0];
        for (int i = 0; i <ar.length ; i++) {
            result = gcd(result,ar[i]);
        }
        return result;
    }
}











