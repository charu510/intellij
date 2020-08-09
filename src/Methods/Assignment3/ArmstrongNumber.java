package Methods.Assignment3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to test");
        int n = s.nextInt();
        if(Armstrong(n)==n)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
    public static int Armstrong(int n){
        int sum=0;

        while(n>0){
            int r = n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        return sum;
    }
}
