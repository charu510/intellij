package Networks_Assignment;

import java.util.Scanner;

public class BinaryDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dividend: ");

        /*Iteger.parseInt() method will convert the string value to
            the integer by treating them as a binary number*/

        int dividend = Integer.parseInt(scan.nextLine(),2);
        System.out.println("\nEnter divisor: ");
        int divisor = Integer.parseInt(scan.nextLine(),2);
        if(divisor!=0)
        {
            String quotient = Integer.toBinaryString((dividend/divisor));
            String remainder = Integer.toBinaryString(XOR(dividend%divisor,dividend%10));
            System.out.println("\nquotient is: "+quotient+" and remainder is: "+remainder);
        }
        else
            System.out.println("\ndivisor can't be zero!");
    }
    public static int XOR(int x,int y){
        return (x|y) - (x&y);
    }

}

