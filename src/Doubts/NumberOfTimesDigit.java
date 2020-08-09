package Doubts;

import java.util.Scanner;

public class NumberOfTimesDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit=s.nextInt();
        System.out.println(count(n,digit));
    }
    public static int count(int n,int digit){
        int counter=0;
        while(n>0){
            int rem=n%10;
            if(rem==digit)
                counter++;
            n=n/10;
        }
        return counter;
    }
}
