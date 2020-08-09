package Methods.Assignment3;

import java.util.*;

public class InverseNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         int place=1;
         double num=0;
        while(n>0){
            int val=n%10;
            n=n/10;
            num=num+Math.pow(10,val-1)*place;
            place=place+1;
        }
        System.out.println(num);
    }
}
