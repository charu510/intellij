package com.company.Assignment2;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int p=1;
        while(row<=n)
        {
            int col=1;

            while(col<=row)
            {
                System.out.print(p+" ");
                p=p+1;
                col=col+1;
            }
            System.out.println();

            row=row+1;
        }
    }
}
