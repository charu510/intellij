package Arrays;

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] ar = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                ar[i][j]=s.nextInt();
            }
        }
        wavePrint(ar);
    }
    public static void wavePrint(int[][] ar){
        for (int i = 0; i <ar.length ; i++) {
            if(i%2==0){
                for(int j=0;j<ar[i].length;j++){
                    System.out.println(ar[i][j]);
                }
            }
            else{
                for (int j = ar[i].length-1; j >=0 ; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }
}
