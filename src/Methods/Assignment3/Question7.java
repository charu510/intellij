package Methods.Assignment3;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int result=0;
        int place=1;

        while(n>0){
            int r = n%10;
            place=place*10;
            n=n/10;
        }
        return place;
    }
}
