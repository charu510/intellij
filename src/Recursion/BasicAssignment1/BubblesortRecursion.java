package Recursion.BasicAssignment1;

import Arrays.Question1;

import java.util.Arrays;

public class BubblesortRecursion {
    public static void main(String[] args) {
        int[] ar = {5,2,3,4,1};
        bubblesort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }
    public static void  bubblesort(int[] ar,int i,int j){
        if(i==0)
            return;
        if(j==i){
            bubblesort(ar,i-1,0);
            return;
        }
        if(ar[j]>ar[j+1]){
            Question1.swap(j,j+1,ar);
        }
        bubblesort(ar,i,j+1);
    }
}
