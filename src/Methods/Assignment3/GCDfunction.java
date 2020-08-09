package Methods.Assignment3;
 /*11.Take as input two numbers N1 and N2. Write a function which calculates and
        returns the GCD of two numbers. Print the value returned.*/

import java.util.Scanner;

public class GCDfunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = s.nextInt();
        System.out.println("Enter second number");
        int n2 = s.nextInt();
        System.out.println(GCD(n1,n2));
    }
    public static int GCD(int n1,int n2){
        int i=1;
        int gcd=0;
        while(i<=n1 && i<=n2){
            if(n1%i==0 && n2%i==0)
                gcd=i;
            i=i+1;
        }
        return gcd;
    }
}
