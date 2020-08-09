package Methods.Assignment3;
/*6. Take as input the following
a. A number
b. A digit
Write a function that returns the number of times digit is found in the number.
Print the value returned.*/

import java.util.Scanner;

public class DigitRepition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        System.out.println("Enter the digit");
        int d = s.nextInt();
        System.out.println(digitRepition(n,d));
    }
    public static int digitRepition(int n,int d){
        int count=0;
        while(n>0){

            int r = n%10;
            if(r==d)
                count++;
            n=n/10;
        }
        return count;
    }
}
