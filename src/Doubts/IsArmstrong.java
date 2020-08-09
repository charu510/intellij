package Doubts;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(armstrong(n));

    }
    public static int digit(int n){
        int digit=0;
        while(n>0){
            int rem=n%10;
            digit++;
            n=n/10;
        }
        return digit;
    }
    public static boolean armstrong(int n){
        int num=n;
        int d = digit(n);
        int sum=0;
        while(n>0){
            double rem=n%10;
            sum=sum+(int)(Math.pow(rem,d));
            n=n/10;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}
