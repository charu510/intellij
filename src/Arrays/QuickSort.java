package Arrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ar = {2,1,4,5,6,3};
        quick(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));
    }
    public static void quick(int[] ar,int start,int end){
        if(end<=start){
            return;
        }
        int pivot = end-1;
        int partition = shifter(ar,start,pivot);

        quick(ar,0,partition);
        quick(ar,partition+1,end);
    }
    public static int shifter(int[] ar,int start,int pivot){
        int j = start;
        for (int i = start; i <pivot ; i++) {
            if(ar[i]<ar[pivot]){
                Question1.swap(i,j,ar);
                j++;
            }
        }
        Question1.swap(pivot,j,ar);
        return j;
    }
}
