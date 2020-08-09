package Recursion;

import java.util.Scanner;

public class PracticeRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=s.nextInt();
        }
        //int element = s.nextInt();
        System.out.println(palindrome(ar,0,ar.length-1));
    }
   public static boolean palindrome(int[] ar,int start,int end){
        if(start==end)
            return true;
        if(ar[start]==ar[end])
            return true;
        return palindrome(ar,start+1,end-1);
   }
}
