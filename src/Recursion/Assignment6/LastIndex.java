package Recursion.Assignment6;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        int element=s.nextInt();
        System.out.println(last(ar,ar.length-1,element));
    }
    public static int last(int[] ar,int index,int element){
        if(index<0)
            return -1;
        if(ar[index]==element)
            return index;
        return last(ar,index-1,element);
    }

}
