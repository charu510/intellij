package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int i = 1;
        int gcd=0;

        while(i<=n1 && i<=n2){
            if(n1%i==0 && n2%i==0)
                gcd=i;
            i=i+1;
        }
        System.out.print(gcd);

    }
}
