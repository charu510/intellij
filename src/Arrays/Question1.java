package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar= new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println(maxValueUpg(ar));
        reverse(ar,0,5);
        System.out.println(Arrays.toString(ar));
    }
    public static int maxValueUpg(int ar[]){
        int max = ar[0];

        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]>max)
                max=ar[i];
        }
        return max;
    }
    public static void swap(int start,int end,int[] ar){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
    }
    public static void reverse(int ar[],int start,int end){

        while(start<end){
            swap(start,end,ar);
            start=start+2;
            end=end-2;
        }
    }
}

