package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int f=0;
        int s=1;
        while(n>0)
        {
           int  t=f+s;
            f=s;
            s=t;
            n=n-1;

        }
        System.out.print(f+" ");


    }
}
