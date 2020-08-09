package Backtracking;

import java.util.Scanner;

public class RatMaze {
    public static boolean flag=false;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //rows
        int m = s.nextInt(); //cols
        char[][] board = new char[n][m];
        //in the row we are putting the whole string
        //and then that string is broken into indivisual
        //chars and then put at the jth position.
        for (int i = 0; i < n; i++) {
            String str = s.next();
            for (int j = 0; j < str.length(); j++) {
                board[i][j] = str.charAt(j);
            }
        }
        int[][] sol = new int[n][n];
        solve(sol,board,0,0,n-1,m-1);
        if(!flag){
            System.out.println(-1);
        }
    }
        public static void solve(int[][] sol,char[][] maze,int i,int j,int n,int m){
            //illegal base case
            if(i>n || j>m || maze[i][j]=='X' || flag==true){
                return;
            }

            //legal base case
            if(i==n && j==m){
                flag=true;
                sol[i][j]=1;
                for (int k = 0; k <n ; k++) {
                    for (int l = 0; l <m ; l++) {
                        System.out.print(sol[k][l]+" ");
                    }
                    System.out.println();
                }
                return;
            }

            //tracing the path
            sol[i][j]=1;
            solve(sol,maze,i,j+1,n,m); //moving horizontal
            solve(sol,maze,i+1,j,n,m); //moving vertical
            sol[i][j]=0; //backtracking

        }
    }
