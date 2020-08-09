package com.company.Assignment2;

import java.util.Scanner;

public class BinomialTriangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=0;
        while(row<n){
            int space=1;
            while(space<=n-row){
                System.out.print(" ");
                space=space+1;
            }
            int col=0;
            int val=1;
            while(col<=row){
                System.out.print(" "+val+" ");
                val=(val*(row-col))/(col+1);
                col=col+1;
            }
            System.out.println();
            row=row+1;
        }
    }
}