package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrayeg {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9,10};



        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        boolean[] ar1= new boolean[size];
        for (int i = 0; i <ar1.length ; i++){
            ar1[i] = s.nextBoolean();
        }
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i]);
        }
        System.out.println(Arrays.toString(ar));

    }
}
