package Assingment4;

import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        //int m = s.nextInt();
        int[][] ar = {{11,12,13,14},
                       {21,22,23,24},
                        {31,32,33,34},
                        {41,42,43,44}};
        wave(ar);

    }
    public static void wave(int[][] ar){
        for (int i = 0; i <ar.length ; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.println(ar[i][j]);
                }
            } else {
                for (int j = ar[i].length - 1; j >= 0; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }
}
