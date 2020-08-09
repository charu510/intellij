package Networks_Assignment;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data block");
        int n = s.nextInt();
        evenParity(n);
    }
    public static int count(int n){
        int c=0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            if(rem==1){
                c++;
            }
        }
        return c;
    }
    public static void evenParity(int n){
        if(count(n)%2!=0){
            System.out.println("The parity bit is 1");
            System.out.println("The code word is:");
            System.out.println(n+"1");
        }
        else
            System.out.println(n);
    }
}
