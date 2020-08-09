package Arrays;

import java.util.Scanner;

public class MatrixSearch {
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
        int element=s.nextInt();
        System.out.println(matrixSearch(ar,element));
    }
    public static String matrixSearch(int[][] ar,int element){
        int i=0;
        int j=ar.length-1;
        while(i<ar.length && j>=0){
            if(ar[i][j]==element)
                return i+" "+j;
            else if(ar[i][j]<element)
                i++;
            else
                j--;
        }
        return "Not Found";
    }
}
