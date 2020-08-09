package Methods.Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class IncreaseDecreaseSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 1; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        if(test(ar)==1)
            System.out.println("true");
        else
            System.out.println("false");
    }
        public static int test(int ar[]){
            int flag=0;
            for (int i = 0; i <ar.length ; i++) {
                if(ar[i]>ar[i+1])
                    flag=1;
                else
                    flag=0;
            }
            return flag;
    }

}

