package com.company.Assignment2;

import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int rem,rev=0;
       //First calculate the reverse of the given number
       while(n!=0)
       {
           rem = n%10;
           rev=rev*10+rem;
           n=n/10;
       }
       //Then assign it as the input number for calculating sum
        n=rev;
       int sumOdd=0,sumEven=0;
       int c=1;
       while(n!=0)
       {
           //if c is even means the digit we sought is even
           if(c%2==0)
               sumEven+=n%10;
           else
               sumOdd+=n%10;
           n=n/10;
           c=c+1;
       }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }
}
