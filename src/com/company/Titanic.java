package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Titanic {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int i = 0;
        double result=0;
        while (i < n) {
            double ans=Math.pow(2,i);
            while (ans < n) {
                result = Math.pow(2, i);
                ans=ans+1;
            }
            i = i + 1;
        }
        System.out.println(result);
    }
}
