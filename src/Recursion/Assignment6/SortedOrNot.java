package Recursion.Assignment6;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(sortedornot(ar,0));
    }
    public static boolean sortedornot(int[] ar,int index){
        if(index==ar.length-1)
            return true;
        if(ar[index]>ar[index+1])
            return false;
        return sortedornot(ar,index+1);

    }
}
