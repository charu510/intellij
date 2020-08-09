package Doubts;

import java.util.Scanner;

public class SimpleHCF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(HCF(ar));
    }
    public static int GCD(int a,int b){
        int i=1;
        int gcd=0;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0)
                gcd=i;
            i++;
        }
        return gcd;
    }
    public static int HCF(int[] ar){
        int result=ar[0];
        for (int i = 0; i <ar.length ; i++) {
            result=GCD(ar[i],result);
        }
        return result;
    }
}
