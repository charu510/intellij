package com.company.Assignment2;

import java.util.Scanner;

public class TestPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int i = 2;
            int flag = 0;
            while (i < n) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                } else
                    flag = 0;
                i = i + 1;
            }
            if (flag == 1)
                System.out.println("Not Prime");
            else
                System.out.println("Prime");
        }
    }
}
