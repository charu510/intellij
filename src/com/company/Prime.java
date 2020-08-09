package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print(n);
    }
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for (int i = 2; i <n ; i++) {
            if(n%i==0)
                return false;

        }
        return true;
    }
    public static void print(int n){
        for (int i = 2; i <=n ; i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
}


