package Arrays;

import java.util.Arrays;

public class ReverseAlgo {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5};
        int k=2;
        Question1.reverse(ar,0,k-1);
        System.out.println(Arrays.toString(ar));

        Question1.reverse(ar,k,ar.length-1);
        System.out.println(Arrays.toString(ar));

        Question1.reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));

    }
}
