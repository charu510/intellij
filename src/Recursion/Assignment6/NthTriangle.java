package Recursion.Assignment6;

import java.util.Scanner;

public class NthTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(nth(n));
    }
    public static int nth(int n){
        if(n==1)
            return 1;
        return n+nth(n-1);
    }
}
