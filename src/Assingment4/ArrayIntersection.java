package Assingment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i <ar1.length ; i++) {
            ar1[i] = s.nextInt();
        }
        int[] ar2 = new int[n];
        for (int i = 0; i <ar2.length ; i++) {
            ar2[i] = s.nextInt();
        }
        intersection(ar1,ar2);
    }
    public static void intersection(int[] ar1,int [] ar2){
        int[] fr1 = new int[ar1.length];
        int visited=-1;
        for (int i = 0; i < ar1.length ; i++) {
            int count=1;
            for (int j = i+1; j <ar1.length ; j++) {
                if (ar1[i] == ar1[j]) {
                    count++;
                    //To avoid counting same element again
                    fr1[j] = visited;
                }
            }
            if(fr1[i]!=visited)
                fr1[i]=count;


        }
        System.out.println(Arrays.toString(fr1));




    }
}
