package Doubts;

import java.util.Scanner;

public class PatternNumbersStars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=1;
        int nst=-1;
        while(row<=n){
            int col=n;
            int p=1;
            while(col>=row){
                System.out.print(p+" ");
                p=p+1;
                col=col-1;
            }
            int colstar=1;
            while(colstar<=nst){
                System.out.print("*"+" ");
                colstar=colstar+1;
            }
            nst+=2;
            System.out.println();
            row=row+1;
        }
    }
}
