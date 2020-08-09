package com.company;

import java.util.Scanner;

public class Hollow_diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int row=1;
        int nst=n/2;
        int nsp=-1;
        while(row<=n){
            int col=1;
            while(col<=nst){
                System.out.print("*"+" ");
                col=col+1;
            }
            //spaces
            col=1;
            while(col<=nsp){
                System.out.print("    ");
                col=col+1;
            }
             col=1;
            while(col<=nst){
                System.out.print("*"+" ");
                col=col+1;
            }
            row=row+1;
            if(row<=n/2){
                nsp+=2;
                nst--;
            }
            else{
                nsp--;
                nst+=2;
            }
            System.out.println();
        }
    }
}


