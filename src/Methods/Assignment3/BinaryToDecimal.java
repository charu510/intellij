package Methods.Assignment3;

import java.util.Scanner;

/*Take N (number in binary format). Write a function that converts it to decimal
format. Print the value returned*/
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int n = s.nextInt();
        System.out.println(BinToDeci(n));
    }

    public static int BinToDeci(int bin){
        int deci=0;
        int place=1;

        while(bin>0)
        {
            int r = bin%10;
            bin=bin/10;
            deci=deci+r*place;
            place=place*2;
        }
        return deci;
    }

}
