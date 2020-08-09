package Methods.Assignment3;

import java.util.Scanner;

public class LogCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x");
        int x = s.nextInt();
        System.out.println("Enter n");
        int n = s.nextInt();
        System.out.println(log(x,n));
    }
    public static int log(int x,int n){
        return (x>n-1)? 1+log(x/n,n):0;
    }
}
