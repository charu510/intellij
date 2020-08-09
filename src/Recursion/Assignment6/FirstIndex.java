package Recursion.Assignment6;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        int element=s.nextInt();
        System.out.println(first(ar,0,element));
    }
    public static int first(int[] ar,int index,int element){
        if(index==ar.length)
            return -1;
        if(ar[index]==element)
            return index;
        return first(ar,index+1,element);
    }
}
