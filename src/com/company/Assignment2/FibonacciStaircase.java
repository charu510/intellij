package com.company.Assignment2;

import java.util.Scanner;

public class FibonacciStaircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int f=0;
        int s=1;
        while(row<=n){
            int col=1;

            while(col<=row){
                System.out.print(f+" ");
                int t=f+s;
                f=s;
                s=t;
                col=col+1;
            }
            System.out.println();
            row=row+1;
        }
    }
}
