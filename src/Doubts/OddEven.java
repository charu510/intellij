package Doubts;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0) {
            int n = s.nextInt();
            check(n);
        }

    }
    public static void check(int n){
        int sumEven=0;
        int sumOdd=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0)
                sumEven+=rem;
            else
                sumOdd+=rem;
            n=n/10;
        }
        if(sumEven%4==0 || sumOdd%3==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
