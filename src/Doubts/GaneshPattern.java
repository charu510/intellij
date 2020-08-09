package Doubts;

import java.util.Scanner;

public class GaneshPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //print patterns
        //First component
        System.out.print("*");
        for (int i = 1; i <=(n-3)/2 ; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <=(n+1)/2 ; i++) {
            System.out.print("*");
        }
        System.out.println();

        //Second component
        for (int rows = 1; rows <=(n-3)/2 ; rows++) {
            System.out.print("*");
            //spaces
            for (int i = 1; i <=(n-3)/2 ; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        //Third component
        for (int i = 1; i <=n ; i++) {
            System.out.print("*");
        }
        System.out.println();

        //Fourth component
        for(int rows=1;rows<=(n-3)/2;rows++){
            for (int i = 1; i <=(n-3)/2+1 ; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i <=(n-3)/2 ; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        //Fifth component
        for (int i = 1; i <=(n+1)/2 ; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <=(n-3)/2 ; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }
}


