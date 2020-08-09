package Doubts;

import java.util.Scanner;

public class N_QueensHackerblocks {
    public static int count=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[][] board = new boolean[n][n];
        count=0;
        nqueens(board,0);
        System.out.println();
        System.out.println(count);

    }
    public static void nqueens(boolean[][] board,int row){
        if(row==board.length){
            count++;
            printmatrix(board);
            return;
        }
        for (int col = 0; col <board.length ; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nqueens(board,row+1);
                board[row][col]=false;
            }
        }
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        //vertical upper
        for (int i = 0; i <row ; i++) {
            if(board[i][col])
                return false;
        }

        //left diagonal
        int left = Math.min(row,col);
        for (int i = 1; i <=left ; i++) {
            if(board[row-i][col-i])
                return false;
        }

        //right diagonal
        int right = Math.min(row,board.length-col-1);
        for (int i = 1; i <=right ; i++) {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }
    public static void printmatrix(boolean[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if(board[i][j])
                    System.out.print("{"+(i+1)+"-"+(j+1)+"}");
            }
            System.out.print(" ");
        }
        System.out.print("  ");
    }


}
