package com.company.Assignment2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=1;
        while(row<=n)
        {
            int col=1;
            while(col<=row)
            {
                if(col==1||col==row)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(row);
                }
                col=col+1;
            }
            System.out.println();
            row=row+1;
        }
    }
}
