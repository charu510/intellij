package com.company.Assignment2;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        hollowRhombus(n);

    }
    public static void hollowRhombus(int n){

        for (int i = 0; i <=n ; i++) {
            //Print trailing spaces
            for (int j = 0; j <=n ; j++) {
                System.out.print(" ");
            }
            //Print stars after spaces
            //Print star for each solid rows
            if(i==1 || i==n){
                for (int j = 1; j <=n ; j++) {
                    System.out.print("*");
                }
            }
            //For printing hollow rows
            else{
                for (int j =1; j <=n ; j++) {
                    if(j==1 || j==n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
