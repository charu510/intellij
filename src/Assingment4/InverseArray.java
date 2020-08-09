package Assingment4;

import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i <ar1.length ; i++) {
            ar1[i]=s.nextInt();
        }
        int[] ar2 = new int[n];
        for (int i = 0; i <ar2.length ; i++) {
            ar2[i]=s.nextInt();
        }
        System.out.println(inversecheck(ar1,ar2));

    }
    public static boolean inversecheck(int[] ar1,int[] ar2){
        int[] br = new int[ar1.length];
        for (int i = 0; i <ar1.length ; i++) {
            int temp = ar1[i];
            br[temp] = i;
        }
        for (int i = 0; i < ar2.length; i++) {
            if(ar2[i]!=br[i]){
                return false;
            }

        }
        return true;
    }
}

