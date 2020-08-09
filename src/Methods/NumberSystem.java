package Methods;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        System.out.println(bintodeci(101));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for conversion");
        int num = sc.nextInt();
        System.out.println("Enter the desired base for conversion");
        int base = sc.nextInt();
        System.out.println(anytodeci(base,num));
        System.out.println(decitobin(5));
        System.out.println("Enter the decimal number for conversion");
        int d = sc.nextInt();
        System.out.println("Enter the base in which you wish to convert");
        int b = sc.nextInt();
        System.out.println(decitoany(d,b));

    }
    //Conversion of binary to decimal number
    public static int bintodeci(int bin) {
        int deci = 0;
        int place = 1;

        while (bin > 0) {
            int r = bin%10;
            bin = bin/10;
            deci = deci + r*place;
            place = place * 2;
        }
        return deci;
    }
    //Conversion of any base number to decimal[Tested for octal to binary]
    public static int anytodeci(int base,int num){
        int deci=0;
        int place=1;

        while(num>0){
            int r=num%10;
            num=num/10;
            deci=deci+r*place;
            place=place*base;
        }
        return deci;
    }

    //Conversion of decimal to binary also for octal to binary
    public static int decitobin(int deci){
        int bin=0;
        int place=1;

        while(deci>0){
            int r=deci%2;
            deci=deci/2;
            bin=bin+r*place;
            place=place*10;
        }
        return bin;
    }
    //Conversion of decimal to any base
    public static int decitoany(int deci,int base){
        int any=0;
        int place=1;

        while(deci>0){
            int r=deci%base;
            deci=deci/base;
            any=any+r*place;
            place=place*10;
        }
        return any;
    }

}
