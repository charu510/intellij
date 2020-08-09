package Recursion.Assignment6;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        decreasing(n);
    }
    public static void decreasing(int n){
        if(n==0)
            return;
        if(n%2!=0){
            System.out.println(n);
            decreasing(n-1);
        }
        else{
            decreasing(n-1);
            System.out.println(n);
        }

    }
}
