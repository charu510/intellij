package Assingment4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] ar = new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=s.nextInt();
        }
        System.out.println(max(ar));
    }

    public static int max(int[] ar){
        int max = ar[0];
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }
}
