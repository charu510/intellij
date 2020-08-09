package Recursion.Assignment6;

import java.util.Scanner;

public class ErectStaircase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows=s.nextInt();
        staircase(rows,0);
    }
    public static void staircase(int rows,int cols){
        if(rows==0)
            return;
        if(rows==cols){
            staircase(rows-1,0);
            System.out.println();
            return;
        }
        staircase(rows,cols+1);
        System.out.print("*");
    }
}
