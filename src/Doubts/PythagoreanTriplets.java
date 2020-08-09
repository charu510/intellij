package Doubts;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        pythagoras(n);
    }
    public static void pythagoras(long n){
        long a;
        long b;
        if(n==1 || n==2)
            System.out.println(-1);
        else if(n%2==0){
            long var = (n*n)/4;
            a=var+1;
            b=var-1;
            if(a>b)
                System.out.println(b+" "+a);
            else
                System.out.println(a+" "+b);
        }
        else if(n%2!=0){
            long var = (n*n+1);
            a=var/2;
            b=var/2-1;
            if(a>b)
                System.out.println(b+" "+a);
            else
                System.out.println(a+" "+b);
        }
    }
}
