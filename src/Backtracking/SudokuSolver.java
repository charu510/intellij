package Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid.length ; j++) {
                grid[i][j]=s.nextInt();
            }
        }
        sudokusolver(grid,0,0);
    }
    public static void sudokusolver(int[][] board,int row,int col){
        //base condition    
        if(row==board.length){
                display(board);
                return;
            }
        //if col is filled then jump to next row and then reset the col to initial start    
        if(col==board.length){
                sudokusolver(board,row+1,0);
                return;
            }
        //checking whether to put value or not
        if(board[row][col]==0){
            for (int val = 1; val <=9 ; val++) {
                if(isSafe(board,row,col,val)) {
                    board[row][col] = val;
                    sudokusolver(board, row, col + 1); //After putting value proceed to new column
                    board[row][col] = 0; //backtracking
                }
            }
        }
        else
            sudokusolver(board,row,col+1);
    }
    //Making the isSafe function
    public static boolean isSafe(int[][] board,int row,int col,int val){
        //Checking whether a row is free
        for (int i = 0; i <board.length ; i++) {
            if(board[i][col]==val)
                return false;
        }
        //Checking whether a column is free
        for (int i = 0; i <board.length ; i++) {
            if(board[row][i]==val)
                return false;
        }
        //Checking in a particular section
        int rno = row/3;
        int cno=col/3;

        for (int i = 3*rno; i <3*(rno+1) ; i++) {
            for (int j = 3*cno; j <3*(cno+1) ; j++) {
                if(board[row][col]==val)
                    return false;

            }

        }
        return true;
    }
    //Printing function
    public static void display(int[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
        