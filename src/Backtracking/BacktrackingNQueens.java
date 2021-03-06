package Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class BacktrackingNQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        nqueen(board,0);
    }
    public static void nqueen(boolean[][] board,int row){
        if(row==board.length){
            printmatrix(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nqueen(board,row+1);
                board[row][col]=false;
            }
        }
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        //Vertical upper
        for (int i = 0; i <row ; i++) {
            if(board[i][col])
                return false;
        }

        //Left diagonal
        int left = Math.min(row,col);
        for (int i = 0; i <=left ; i++) {
            if(board[row-i][col-i])
                return false;
        }

        //Right diagonal
        int right = Math.min(row,board.length-col-1);
        for (int i = 0; i <=right ; i++) {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }

    public static void printmatrix(boolean[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if(board[i][j])
                    System.out.print("Q");
                else
                    System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();
    }

}
