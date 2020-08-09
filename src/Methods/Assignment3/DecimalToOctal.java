package Methods.Assignment3;

import java.util.Scanner;

/*2. Take N (number in decimal format). Write a function that converts it to octal
format. Print the value returned.*/
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = s.nextInt();
        System.out.println(DeciToOct(n));
    }
    public static int DeciToOct(int deci){
        int oct=0;
        int place=1;

        while(deci>0){
            int r=deci%8;
            deci=deci/8;
            oct=oct+r*place;
            place=place*10;
        }
        return oct;
    }
}
