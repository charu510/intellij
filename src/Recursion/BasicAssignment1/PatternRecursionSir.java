package Recursion.BasicAssignment1;

import java.util.Scanner;

public class PatternRecursionSir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(5,0);
    }
    public static void pattern(int row,int col){
        if(row==0){
            return;
        }
        if(col==row){
            System.out.println();
            pattern(row-1,0);
            return;
        }
        System.out.print("*");
        pattern(row,col+1);
        //Reversing the pattern gives increasing order
    }
}
