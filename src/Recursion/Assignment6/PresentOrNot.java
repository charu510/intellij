package Recursion.Assignment6;

import java.util.Scanner;

public class PresentOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        int element = s.nextInt();
        System.out.println(find(ar,0,element));
    }
    public static boolean find(int[] ar,int index,int element){
        if(index==ar.length)
            return false;
        if(ar[index]==element)
            return true;
        return find(ar,index+1,element);
    }
}
