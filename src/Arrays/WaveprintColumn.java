package Arrays;

import java.util.Scanner;

public class WaveprintColumn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(); //Row
        int n = s.nextInt(); //Column
        int[][] ar = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                ar[i][j]=s.nextInt();
            }
        }
        wavePrint(ar,m,n);
    }
    public static void wavePrint(int[][] ar,int m,int n){
        for(int j=0;j<n;j++){
            if(j%2==0){
                for (int i = 0; i <m ; i++) {
                    System.out.print(ar[i][j]+", ");
                }
            }
            else{
                for (int i = m-1; i>=0 ; i--) {
                    System.out.print(ar[i][j]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
