package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar={3,5,2,1,7};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element to search");
        int element = s.nextInt();
        System.out.println(linear(ar,element));
}
public static int linear(int[] ar,int element){
    for (int i = 0; i <ar.length ; i++) {
        if(ar[i]==element){
            return i;
        }
    }
    return -1;
    }
}
