package Doubts;//Chewbacca number

import java.util.Scanner;

public class Doubts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long mul=1;
        long ans=0;
        while(n>9){
            long rem = n%10;
            if(9-rem<rem)
                ans=ans+(9-rem)*mul;
            else
                ans=ans+rem*mul;
            mul=mul*10;
            n=n/10;
        }
        if(n==9)
            ans=ans+n*mul;
        if(9-n<n)
            ans=ans+(9-n)*mul;
        else
            ans=ans+mul*n;
        System.out.println(n);


    }
}
